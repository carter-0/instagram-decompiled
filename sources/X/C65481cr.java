package X;

import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.1cr  reason: invalid class name and case insensitive filesystem */
public final class C65481cr extends 1bp implements C65421cY, C65431cZ {
    public static final 1OW A0L = new 1ct();
    public AnonymousClass7FN A00;
    public ExtendedImageUrl A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Integer A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public boolean A0K;

    public final String A02() {
        return "send_reel_share_message";
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1cr.ACS():X.1cX, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.1cX ACS() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1cr.ACS():X.1cX, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65481cr.ACS():X.1cX");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1cr.CH1():java.util.List, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.util.List CH1() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1cr.CH1():java.util.List, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65481cr.CH1():java.util.List");
    }

    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    public final 2FW Aqm() {
        return 2FW.A1T;
    }

    public final Object BS1() {
        AnonymousClass53G r0;
        AnonymousClass7FN r2 = this.A00;
        AnonymousClass7Q3 r1 = r2.A01;
        if (r1 == AnonymousClass7Q3.REPLY_GIF) {
            r0 = r2.A03;
        } else if (r1 != AnonymousClass7Q3.AVATAR_REACTION) {
            return r2.A0A;
        } else {
            r0 = this.A01;
        }
        r0.getClass();
        return r0;
    }

    public final 2FW BS4() {
        AnonymousClass7Q3 r1 = this.A00.A01;
        if (r1 == AnonymousClass7Q3.EMOJI_REACTION) {
            return 2FW.A0m;
        }
        if (r1 == AnonymousClass7Q3.AVATAR_REACTION) {
            return 2FW.A0N;
        }
        if (r1 == AnonymousClass7Q3.REPLY_GIF) {
            return 2FW.A0K;
        }
        return 2FW.A1g;
    }

    public final 2FW CH4() {
        return 2FW.A1y;
    }
}
