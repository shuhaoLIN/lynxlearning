package com.example.myfirstlynxapp

import android.app.Activity
import android.os.Bundle
import com.lynx.tasm.LynxView
import com.lynx.tasm.LynxViewBuilder

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val lynxView = buildLynxView()
        setContentView(lynxView)
        val uri = "main.lynx.bundle";
        lynxView.renderTemplateUrl(uri, "")
    }
    private fun buildLynxView(): LynxView {
        val viewBuilder: LynxViewBuilder = LynxViewBuilder()
        viewBuilder.setTemplateProvider(DemoTemplateProvider(this))
        return viewBuilder.build(this)
    }

}