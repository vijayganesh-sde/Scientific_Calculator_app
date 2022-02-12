package com.example.scientificcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.math.ln

class MainActivity : AppCompatActivity() {
    lateinit var PrimaryTVBtn: TextView
    lateinit var SecondaryTVBtn: TextView
    lateinit var ACBtn: Button
    lateinit var CBtn: Button
    lateinit var Brac1Btn: Button
    lateinit var Brac2Btn: Button
    lateinit var sinBtn: Button
    lateinit var cosBtn: Button
    lateinit var tanBtn: Button
    lateinit var logBtn: Button
    lateinit var lnBtn: Button
    lateinit var sqrtBtn: Button
    lateinit var sqrBtn: Button
    lateinit var remBtn: Button
    lateinit var recipBtn: Button
    lateinit var divBtn: Button
    lateinit var oneBtn: Button
    lateinit var twoBtn: Button
    lateinit var threeBtn: Button
    lateinit var multBtn: Button
    lateinit var fourBtn: Button
    lateinit var fiveBtn: Button
    lateinit var sixBtn: Button
    lateinit var addBtn: Button
    lateinit var sevenBtn: Button
    lateinit var eightBtn: Button
    lateinit var nineBtn: Button
    lateinit var subBtn: Button
    lateinit var piBtn: Button
    lateinit var zeroBtn: Button
    lateinit var dotBtn: Button
    lateinit var equalsBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PrimaryTVBtn = findViewById(R.id.idTVPrimary)
        SecondaryTVBtn=findViewById(R.id.idTVSecondary)
        ACBtn=findViewById(R.id.idBtnAC)
        CBtn=findViewById(R.id.idBtnC)
        Brac1Btn=findViewById(R.id.idBtnBrac1)
        Brac2Btn=findViewById(R.id.idBtnBrac2)
        sinBtn=findViewById(R.id.idBtnsin)
        cosBtn=findViewById(R.id.idBtncos)
        tanBtn=findViewById(R.id.idBtntan)
        logBtn=findViewById(R.id.idBtnlog)
        lnBtn=findViewById(R.id.idBtnln)
        sqrtBtn=findViewById(R.id.idBtnsqrt)
        sqrBtn=findViewById(R.id.idBtnsqr)
        remBtn=findViewById(R.id.idBtnrem)
        recipBtn=findViewById(R.id.idBtnrecip)
        divBtn=findViewById(R.id.idBtndiv)
        oneBtn=findViewById(R.id.idBtnone)
        twoBtn=findViewById(R.id.idBtntwo)
        threeBtn=findViewById(R.id.idBtnthree)
        multBtn=findViewById(R.id.idBtnmult)
        fourBtn=findViewById(R.id.idBtnfour)
        fiveBtn=findViewById(R.id.idBtnfive)
        sixBtn=findViewById(R.id.idBtnsix)
        addBtn=findViewById(R.id.idBtnadd)
        sevenBtn=findViewById(R.id.idBtnseven)
        eightBtn=findViewById(R.id.idBtneight)
        nineBtn=findViewById(R.id.idBtnnine)
        subBtn=findViewById(R.id.idBtnsub)
        piBtn=findViewById(R.id.idBtnpi)
        zeroBtn=findViewById(R.id.idBtnzero)
        dotBtn=findViewById(R.id.idBtndot)
        equalsBtn=findViewById(R.id.idBtnequals)

        oneBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"1")
        }
        twoBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"2")
        }
        threeBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"3")
        }
        fourBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"4")
        }
        fiveBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"5")
        }
        sixBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"6")
        }
        sevenBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"7")
        }
        eightBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"8")
        }
        nineBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"9")
        }
        zeroBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"0")
        }
        dotBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+".")
        }
        addBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"+")
        }
        divBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"/")
        }
        Brac1Btn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"(")
        }
        Brac2Btn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+")")
        }
        piBtn.setOnClickListener{
            PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"3.14159")
        }
        sinBtn.setOnClickListener{
            if(PrimaryTVBtn.text.toString().isEmpty()){
                Toast.makeText(this, "enter value before pressing sin", Toast.LENGTH_SHORT).show()
            }
            else{
                var str:String=PrimaryTVBtn.text.toString()
                val degree:Double=str.toDouble()*Math.PI/180
                val result=Math.sin(degree)
                SecondaryTVBtn.text=result.toString()
                PrimaryTVBtn.text=("sin"+"("+PrimaryTVBtn.text.toString()+")")
            }

        }
        cosBtn.setOnClickListener{
            if(PrimaryTVBtn.text.toString().isEmpty()){
                Toast.makeText(this, "enter value before pressing cos", Toast.LENGTH_SHORT).show()
            }
            else{
                var str:String=PrimaryTVBtn.text.toString()
                val degree:Double=str.toDouble()*Math.PI/180
                val result=Math.cos(degree)
                SecondaryTVBtn.text=result.toString()
                PrimaryTVBtn.text=("cos"+"("+PrimaryTVBtn.text.toString()+")")
            }

        }
        tanBtn.setOnClickListener{
            if(PrimaryTVBtn.text.toString().isEmpty()){
                Toast.makeText(this, "enter value before pressing tan", Toast.LENGTH_SHORT).show()
            }
            else{
                var str:String=PrimaryTVBtn.text.toString()
                val degree:Double=str.toDouble()*Math.PI/180
                val result=Math.tan(degree)
                SecondaryTVBtn.text=result.toString()
                PrimaryTVBtn.text=("tan"+"("+PrimaryTVBtn.text.toString()+")")
            }
        }
        lnBtn.setOnClickListener{
            if(PrimaryTVBtn.text.toString().isEmpty()){
                Toast.makeText(this, "enter value before pressing ln", Toast.LENGTH_SHORT).show()
            }
            else{
                var str:String=PrimaryTVBtn.text.toString()
                val result= ln(str.toDouble())
                SecondaryTVBtn.text=result.toString()
                PrimaryTVBtn.text=("ln"+"("+PrimaryTVBtn.text.toString()+")")
            }
        }
        logBtn.setOnClickListener{
            if(PrimaryTVBtn.text.toString().isEmpty()){
                Toast.makeText(this, "enter value before pressing log", Toast.LENGTH_SHORT).show()
            }
            else{
                var str:String=PrimaryTVBtn.text.toString()
                val result=Math.log10(str.toDouble())
                SecondaryTVBtn.text=result.toString()
                PrimaryTVBtn.text=("log"+"("+PrimaryTVBtn.text.toString()+")")
            }
        }
        addBtn.setOnClickListener{
            val str:String=PrimaryTVBtn.text.toString()
            if(str.isEmpty()){
                PrimaryTVBtn.text=""
            }
            else{
                PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"+")
            }
        }
        multBtn.setOnClickListener{
            val str:String=PrimaryTVBtn.text.toString()
            if(str.isEmpty()){
                PrimaryTVBtn.text=""
            }
            else{
                PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"*")
            }

        }
        subBtn.setOnClickListener{
            val str:String=PrimaryTVBtn.text.toString()
            if(str.isEmpty()){
                PrimaryTVBtn.text=""
            }
            else{
                PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"-")
            }
        }
        divBtn.setOnClickListener{
            val str:String=PrimaryTVBtn.text.toString()
            if(str.isEmpty()){
                PrimaryTVBtn.text=""
            }
            else{
                PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"/")
            }

        }
        sqrtBtn.setOnClickListener{
            if(PrimaryTVBtn.text.toString().isEmpty()){
                Toast.makeText(this,"please enter a valid number", Toast.LENGTH_SHORT).show()
            }
            else{
                val str:String=PrimaryTVBtn.text.toString()
                val r=Math.sqrt(str.toDouble())
                val result=r.toString()
                PrimaryTVBtn.text=result
            }
        }

        ACBtn.setOnClickListener{
            PrimaryTVBtn.text=""
            SecondaryTVBtn.text=""
        }
        CBtn.setOnClickListener {
            var str:String=PrimaryTVBtn.text.toString()
            if(!str.equals("")){
                val str1:String=str.substring(0,str.length-1)
                PrimaryTVBtn.text=str1
            }
        }
        sqrBtn.setOnClickListener {
            if(PrimaryTVBtn.text.toString().isEmpty()){
                Toast.makeText(this, "please enter a valid number", Toast.LENGTH_SHORT).show()
            }
            else{
                val d=PrimaryTVBtn.text.toString().toDouble()
                val result=d*d
                PrimaryTVBtn.text=result.toString()
                SecondaryTVBtn.text=result.toString()
            }
        }
        recipBtn.setOnClickListener {
            val str: String = PrimaryTVBtn.text.toString()
            if(str.isEmpty()){
                PrimaryTVBtn.text=""
            }
            else {
                var val1 = str.toDouble()
                val result: Double = Math.pow(val1, -1.0)
                PrimaryTVBtn.text = result.toString()
            }

        }
        remBtn.setOnClickListener{
            val str:String=PrimaryTVBtn.text.toString()
            if(str.isEmpty()){
                PrimaryTVBtn.text=""
            }
            if(!(str.get(index=str.length-1).equals("%"))){
                PrimaryTVBtn.text=(PrimaryTVBtn.text.toString()+"%")
            }
        }
        equalsBtn.setOnClickListener() {
            var str:String=PrimaryTVBtn.text.toString()
            if (str.contains('*')==true && str.contains('(')==false){
                var ind=str.indexOf('*')
                var n1=str.substring(0,ind).toDouble()
                var n2=str.substring(ind+1,str.length).toDouble()
                var res=n1*n2
                PrimaryTVBtn.text=res.toString()
            }
            else if (str.contains('+')==true && str.contains('(')==false){
                val ind=str.indexOf('+')
                var n1=str.substring(0,ind).toDouble()
                var n2=str.substring(ind+1,str.length).toDouble()
                val res=n1+n2
                PrimaryTVBtn.text=res.toString()
            }
            else if (str.contains('-')==true && str.contains('(')==false){
                val ind=str.indexOf('-')
                var n1=str.substring(0,ind)
                var n2=str.substring(ind+1,str.length)
                val result=n1.toDouble()-n2.toDouble()
                PrimaryTVBtn.text=result.toString()
            }
            else if (str.contains('/')==true && str.contains('(')==false){
                val ind=str.indexOf('/')
                var n1=str.substring(0,ind).toDouble()
                var n2=str.substring(ind+1,str.length).toDouble()
                val res=n1/n2
                PrimaryTVBtn.text=res.toString()
            }
            else if (str.contains('%')==true && str.contains('(')==false){
                val ind=str.indexOf('%')
                var n1=str.substring(0,ind).toInt()
                var n2=str.substring(ind+1,str.length).toInt()
                val res=n1%n2
                PrimaryTVBtn.text=res.toString()
            }
            else if(str.contains('(')){
                val ind1=str.indexOf('(')
                var str1:String
                if(str.contains(')')){
                    str1=str.substring(ind1+1,str.length-1)
                }
                else{
                    str1=str.substring(ind1+1,str.length)
                }

                if(str1.contains('+')){
                    val ind=str1.indexOf('+')
                    var n1=str1.substring(0,ind).toDouble()
                    var n2=str1.substring(ind+1,str1.length).toDouble()
                    val res=n1+n2
                    PrimaryTVBtn.text=(str.substring(0,ind1)+res.toString())
                    Toast.makeText(this,"please enter = again",Toast.LENGTH_SHORT).show()
                }
                if(str1.contains('-')){
                    val ind=str1.indexOf('-')
                    var n1=str1.substring(0,ind).toDouble()
                    var n2=str1.substring(ind+1,str1.length).toDouble()
                    val res=n1-n2
                    PrimaryTVBtn.text=(str.substring(0,ind1)+res.toString())
                    Toast.makeText(this,"please enter = again",Toast.LENGTH_SHORT).show()
                }
                if(str1.contains('*')){
                    val ind=str1.indexOf('*')
                    var n1=str1.substring(0,ind).toDouble()
                    var n2=str1.substring(ind+1,str1.length).toDouble()
                    val res=n1*n2
                    PrimaryTVBtn.text=(str.substring(0,ind1)+res.toString())
                    Toast.makeText(this,"please enter = again",Toast.LENGTH_SHORT).show()
                }
                if(str1.contains('/')){
                    val ind=str1.indexOf('/')
                    var n1=str1.substring(0,ind).toDouble()
                    var n2=str1.substring(ind+1,str1.length).toDouble()
                    val res=n1/n2
                    PrimaryTVBtn.text=(str.substring(0,ind1)+res.toString())
                    Toast.makeText(this,"please enter = again",Toast.LENGTH_SHORT).show()
                }

            }
            else{
                PrimaryTVBtn.text=""
            }

        }

    }
}