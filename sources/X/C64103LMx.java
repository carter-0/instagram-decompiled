package X;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: X.LMx  reason: case insensitive filesystem */
public final class C64103LMx {
    public final L3A A00;
    public final HashMap A01;
    public final ConcurrentHashMap A02;
    public final ExecutorService A03;
    public final LMP A04;
    public final HashMap A05;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Q1d, java.lang.Object] */
    public C64103LMx(LMP lmp) {
        String str;
        this.A04 = lmp;
        this.A01 = AnonymousClass7TE.A1E();
        this.A05 = AnonymousClass7TE.A1E();
        this.A02 = new ConcurrentHashMap();
        this.A03 = new Object().A02(AnonymousClass05K.A06, 1);
        String str2 = lmp.A02;
        switch (lmp.A01.intValue()) {
            case 0:
                str = "NOT_SET";
                break;
            case 1:
                str = "FB_REELS";
                break;
            case 2:
                str = "FB_FEED";
                break;
            case 3:
                str = "InspirationVideo";
                break;
            case 4:
                str = "InspirationStories";
                break;
            case 5:
                str = "FB_SMART_THUMBNAIL";
                break;
            default:
                str = C273654mx.A00(485);
                break;
        }
        this.A00 = new L3A(lmp.A00, str2, str);
    }

    public C64103LMx() {
        this(new LMP((C13886Tj9) null, AnonymousClass05K.A00, ""));
    }
}
