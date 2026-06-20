const body = document.querySelector("body")

const print = data => body.innerHTML
const seleçoes = ["brasi", "argentina" , "uruguai", "colombia"]

seleçoes[ seleçoes.length] = "uruguai"
seleçoes.push("costa rica")
seleçoes.push("haiti")
seleçoes.push("canada")
seleçoes.push("estados unidos")
let contador = 0 

while(contador<=  100  ){
   if(contador %2 == 0 && contador != 0){
    print(contador)
   }
    contador++
}