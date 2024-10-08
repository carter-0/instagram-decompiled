package androidx.appcompat.widget;

import X.AnonymousClass0fD;
import X.C22516Y7n;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.ref.WeakReference;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
public final class ViewStubCompat extends View {
    public LayoutInflater A00;
    public int A01;
    public int A02;
    public C22516Y7n A03;
    public WeakReference A04;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: androidx.appcompat.widget.ViewStubCompat.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public ViewStubCompat(android.content.Context r1, android.util.AttributeSet r2, int r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: androidx.appcompat.widget.ViewStubCompat.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ViewStubCompat.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: androidx.appcompat.widget.ViewStubCompat.A00():android.view.View, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final android.view.View A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: androidx.appcompat.widget.ViewStubCompat.A00():android.view.View, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ViewStubCompat.A00():android.view.View");
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: androidx.appcompat.widget.ViewStubCompat.setVisibility(int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public void setVisibility(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: androidx.appcompat.widget.ViewStubCompat.setVisibility(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ViewStubCompat.setVisibility(int):void");
    }

    public int getInflatedId() {
        return this.A01;
    }

    public LayoutInflater getLayoutInflater() {
        return this.A00;
    }

    public int getLayoutResource() {
        return this.A02;
    }

    public void setInflatedId(int i) {
        this.A01 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.A00 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.A02 = i;
    }

    public void setOnInflateListener(C22516Y7n y7n) {
        this.A03 = y7n;
    }

    public final void draw(Canvas canvas) {
        AnonymousClass0fD.A0A(-215613566, AnonymousClass0fD.A03(-1876331023));
    }
}
