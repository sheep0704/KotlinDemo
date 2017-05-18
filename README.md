# KotlinDemo
Kotlin  demo，sample，测试，引入，apk 逆向 smali 格式查看 ，Kotlin 语言。
 
## Kotlin Convert 

```
/**
 * 测试 Kotlin
 * @author Karl-dujinyang
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()//初始化
        testValue()//赋值和事件
    }

    private fun testValue() {
        btnWs!!.setOnClickListener {
            tvWs!!.text = "I'm immqy"
            edtWs!!.setText("Karl-dujinyang")
        }
    }

    private var btnWs: Button? = null
    private var tvWs: TextView? = null
    private var edtWs: EditText? = null

    private fun initView() {
        btnWs = this.findViewById(R.id.btn_hw) as Button
        tvWs = this.findViewById(R.id.tx_hw) as TextView
        edtWs = this.findViewById(R.id.edt_hw) as EditText
    }


}
```


<br/> <br/> 

关于作者
==
<br/>

**QQ:** 309933706 <br/>

**QQ群:**  246231638 <br/>

Email:dujin_dudu@163.com
