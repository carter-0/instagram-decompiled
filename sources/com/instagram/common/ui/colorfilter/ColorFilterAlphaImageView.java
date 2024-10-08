package com.instagram.common.ui.colorfilter;

import X.AnonymousClass37O;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.AttributeSet;
import android.widget.ImageView;

@Deprecated
public class ColorFilterAlphaImageView extends ImageView {
    public int A00 = 77;
    public int A01 = 255;
    public int A02 = 255;
    public int A03 = 255;
    public Integer A04;
    public Integer A05;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView.A01():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private void A01() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView.A01():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView.A01():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView.A02():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private void A02() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView.A02():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView.A02():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView.A03(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private void A03(android.content.Context r1, android.util.AttributeSet r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView.A03(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView.A03(android.content.Context, android.util.AttributeSet):void");
    }

    public ColorFilter getActiveColorFilter() {
        Integer num = this.A04;
        if (num == null) {
            return null;
        }
        return AnonymousClass37O.A00(num.intValue());
    }

    public int getDisabledAlpha() {
        return this.A00;
    }

    public ColorFilter getNormalColorFilter() {
        Integer num = this.A05;
        if (num == null) {
            return null;
        }
        return AnonymousClass37O.A00(num.intValue());
    }

    public void setActiveAlpha(int i) {
        this.A02 = i;
        A01();
        A02();
    }

    public void setActiveColor(int i) {
        Integer valueOf;
        if (i == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i);
        }
        this.A04 = valueOf;
        A02();
    }

    public void setDisabledAlpha(int i) {
        this.A00 = i;
        A01();
        A02();
    }

    public void setNormalAlpha(int i) {
        this.A01 = i;
        A01();
        A02();
    }

    public void setNormalColor(int i) {
        Integer valueOf;
        if (i == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i);
        }
        this.A05 = valueOf;
        A02();
    }

    public void setPressedAlpha(int i) {
        this.A03 = i;
        A01();
        A02();
    }

    public ColorFilterAlphaImageView(Context context) {
        super(context);
    }

    public final void A04(int i, int i2) {
        setNormalColor(i);
        setActiveColor(i2);
        A01();
        A02();
    }

    public void setImageAlpha(int i) {
        super.setImageAlpha(i);
        this.A00 = Math.max(this.A00, i);
        this.A01 = Math.max(this.A01, i);
        this.A02 = Math.max(this.A02, i);
        this.A03 = Math.max(this.A03, i);
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        A01();
        A02();
    }

    public ColorFilterAlphaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03(context, attributeSet);
    }

    public ColorFilterAlphaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(context, attributeSet);
    }
}
