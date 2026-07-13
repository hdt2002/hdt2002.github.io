export class Engine{
constructor(){this.canvas=document.createElement('canvas');document.getElementById('app').appendChild(this.canvas);this.ctx=this.canvas.getContext('2d');this.resize();window.addEventListener('resize',()=>this.resize());}
resize(){this.canvas.width=innerWidth;this.canvas.height=innerHeight;}
start(){const loop=()=>{this.ctx.fillStyle='#050816';this.ctx.fillRect(0,0,this.canvas.width,this.canvas.height);this.ctx.fillStyle='white';this.ctx.font='28px sans-serif';this.ctx.fillText('Love Surprise - Milestone 1',40,60);requestAnimationFrame(loop)};loop();}
}