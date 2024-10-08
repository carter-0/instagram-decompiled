package com.instagram.fbpay.w3c.views;

import android.content.Intent;
import com.instagram.base.activity.IgFragmentActivity;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:574)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:220)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:151)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
public final class PaymentActivity extends IgFragmentActivity {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.fbpay.w3c.views.PaymentActivity.getSession():X.0lg, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final /* bridge */ /* synthetic */ X.0lg getSession() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.fbpay.w3c.views.PaymentActivity.getSession():X.0lg, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fbpay.w3c.views.PaymentActivity.getSession():X.0lg");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.fbpay.w3c.views.PaymentActivity.getSession():X.0wW, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final /* bridge */ /* synthetic */ X.AnonymousClass0wW getSession() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.fbpay.w3c.views.PaymentActivity.getSession():X.0wW, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fbpay.w3c.views.PaymentActivity.getSession():X.0wW");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.fbpay.w3c.views.PaymentActivity.onPostCreate(android.os.Bundle):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onPostCreate(android.os.Bundle r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.fbpay.w3c.views.PaymentActivity.onPostCreate(android.os.Bundle):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fbpay.w3c.views.PaymentActivity.onPostCreate(android.os.Bundle):void");
    }

    public PaymentActivity() {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.fbpay.w3c.views.PaymentActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            setResult(i2, intent);
            finish();
        }
    }
}
