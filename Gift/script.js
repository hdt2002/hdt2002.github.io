function createFlower() {
    const flower = document.createElement('div');
    flower.classList.add('flower');
    
    // Đặt vị trí ngẫu nhiên cho hoa
    flower.style.left = Math.random() * 100 + "vw";
    flower.style.animationDuration = Math.random() * 3 + 2 + "s"; // Thời gian rơi ngẫu nhiên từ 2 đến 5 giây

    document.body.appendChild(flower);

    // Xóa hoa sau khi hoàn tất hiệu ứng
    setTimeout(() => {
        flower.remove();
    }, 5000);
}

// Tạo nhiều hoa rơi
setInterval(createFlower, 500);
