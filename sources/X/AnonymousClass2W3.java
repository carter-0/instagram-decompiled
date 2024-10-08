package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.litho.BaseMountingView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2W3  reason: invalid class name */
public final class AnonymousClass2W3 {
    public static final C56540I0p A08 = new Object();
    public static final Map A09 = new HashMap();
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass2TY A06;
    public final 2TR A07;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2W3.A02():java.util.List, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.util.List A02() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2W3.A02():java.util.List, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2W3.A02():java.util.List");
    }

    public final Rect A00() {
        if (this.A01 != 0 || !this.A00) {
            int i = this.A02 + this.A03;
            int i2 = this.A04 + this.A05;
            AnonymousClass2TY r0 = this.A06;
            return new Rect(i, i2, r0.getWidth() + i, r0.getHeight() + i2);
        }
        AnonymousClass2TY r02 = this.A06;
        return new Rect(0, 0, r02.getWidth(), r02.getHeight());
    }

    public final BaseMountingView A01() {
        View BUI;
        AnonymousClass3XH r0 = this.A06.A00.A03;
        if (r0 == null) {
            BUI = null;
        } else {
            BUI = r0.A02.BUI();
        }
        return (BaseMountingView) BUI;
    }

    public AnonymousClass2W3(AnonymousClass2TY r1, 2TR r2, int i, int i2, int i3, int i4, int i5) {
        this.A06 = r1;
        this.A07 = r2;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A05 = i5;
    }
}
