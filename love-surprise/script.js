const container = document.getElementById('puzzle-container');
const audio = document.getElementById('bg-music');
const rows = 10, cols = 10;
const pieces = [];
const imagePath = 'photo.jpg'; // THAY ĐƯỜNG DẪN ẢNH CỦA BẠN VÀO ĐÂY

// Tạo 100 mảnh ghép [11, 12]
function createPuzzle() {
    const pWidth = 500 / cols;
    const pHeight = 500 / rows;

    for (let r = 0; r < rows; r++) {
        for (let c = 0; c < cols; c++) {
            const piece = document.createElement('div');
            piece.className = 'piece';
            piece.style.width = pWidth + 'px';
            piece.style.height = pHeight + 'px';
            piece.style.backgroundImage = `url(${imagePath})`;
            piece.style.backgroundPosition = `-${c * pWidth}px -${r * pHeight}px`;
            
            // Tọa độ đích (ảnh hoàn chỉnh)
            piece.targetX = c * pWidth;
            piece.targetY = r * pHeight;

            // Tọa độ khởi đầu (Hình trái tim) [8]
            const t = Math.random() * 2 * Math.PI;
            const xHeart = 16 * Math.pow(Math.sin(t), 3);
            const yHeart = -(13 * Math.cos(t) - 5 * Math.cos(2*t) - 2 * Math.cos(3*t) - Math.cos(4*t));
            
            gsap.set(piece, {
                x: 250 + xHeart * 10, 
                y: 250 + yHeart * 10,
                rotation: gsap.utils.random(-30, 30)
            });

            container.appendChild(piece);
            pieces.push(piece);
        }
    }
}

// Hoạt ảnh tụ lại khi click [13, 14]
container.addEventListener('click', () => {
    audio.play(); // Phát nhạc [Thêm theo yêu cầu]
    document.getElementById('instruction').style.display = 'none';

    const tl = gsap.timeline();

    // Bước 1: Bay tự do xáo trộn (Scramble) [15]
    tl.to(pieces, {
        duration: 1.5,
        x: () => gsap.utils.random(-200, 700),
        y: () => gsap.utils.random(-200, 700),
        rotation: () => gsap.utils.random(-180, 180),
        scale: 0.5,
        ease: "power2.inOut"
    })
    // Bước 2: Tụ lại thành ảnh hoàn chỉnh [9, 10]
    .to(pieces, {
        duration: 2.5,
        x: (i, target) => target.targetX,
        y: (i, target) => target.targetY,
        rotation: 0,
        scale: 1,
        stagger: {
            amount: 1.5,
            from: "center" // Hiệu ứng lan tỏa từ tâm [10]
        },
        ease: "back.out(1.2)"
    });
});

createPuzzle();
