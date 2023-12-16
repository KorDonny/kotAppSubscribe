package com.example.myapplication

fun main(){
    //helloworld()
    //println(add(3, 4))
    checkNum(1)
}
//1. 함수
/* 코틀린은 뭘 리턴하던 fun fun_name() : return_type{}으로 작성. 리턴타입이 없으면 Unit이라고 쓰자.
리턴타입 없으면 생략도 가능, ex) : Unit 지워도 됌.
* */

fun helloworld() : Unit{
    println("Hello World")
}
/* 만약 리턴타입이 있으면 어떻게?
* */
fun add(a: Int, b: Int) : Int{
    return a+b
}//자바와 달리 (변수명: 변수타입 ) : 리턴타입
/*
2. val vs var
val -> 자바로 치면 final
var -> 자동인식 타입
* */
fun hi(){
    val a : Int = 10
    var b : Int = 9
    //a = 11 -> 문법상 오류, 값변경 불가.
    b = 10
    val c = 100
    var d = 100 //val이든 var든 알아서 타입 인식을 해줘서 코틀린 개편하다.
}
//3. String Template
fun pract(){
    val name = "Joyce"
    println("My name is $name")//달러표시+변수명 ->알아서 참조해서 값긁어옴.
    println("My name is $name+ass")//만약 띄어쓰기 안하면 ass까지 통짜로 인식.
    println("My name is {$name}I'm 23")//이런 형식으로 구분지으면 인식됨.
    println("My name is \$a")//달러를 기호대로 쓰고 싶으면 백슬래쉬
}
//4. 조건식
fun maxBy(a : Int, b : Int) : Int{
    if (a>b) return a
    else return b
}
fun maxBy2(a : Int, b : Int) = if(a>b) a else b //->뭐해서 a아님 b라는 값을 만들면 이것은 expression
//자바의 return (a>b) ? a : b 와 같은 삼항연산자가 없기 때문에, 위와같이 사용.
//근데 더 간편한건 ㅇㅈ 리턴타입도 생략해도 알아서 하누
fun checkNum(score : Int){
    when(score){//->이건 값을 만드는게 아닌 어떤걸 실행하도록 만드는 문장. statement
        0->println("this is 0")
        1->println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("IDK")
    }//자바의 switch와 유사한 when. 근데 존나 편함.
    var b : Int = when(score){//->다만 이때의 when은 값을 만들므로 expression
        1->1
        2->2
        else -> 3
    }
    println("b : $b")
    when(score){
        in 90..100 -> println("U R genius")
        //>=10&&score<=80->println("nah") 자바형식으로는 인식이 안되네....
    }
}
//Expression vs Statement
//생략만 된거지, 모든 함수는 expression이다.
//expression -> 뚝딱거려서 값을 반환하는것.
//statement -> 명령을 지시하는 문장
//리턴값 없는 java의 void와 같은 함수들은 statement형태.
//자바에서는 if,switch는 statement로만 사용가능했으나, 코틀린에서는 if, when을 expression으로도 사용가능.

//5.Array & List : 3-1 24min 41sec