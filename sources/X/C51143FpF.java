package X;

import android.graphics.RectF;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.FpF  reason: case insensitive filesystem */
public final class C51143FpF implements 1aV {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ C330367Mm A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public C51143FpF(RectF rectF, AnonymousClass0iw r2, C330367Mm r3, String str, String str2, String str3, List list) {
        this.A02 = r3;
        this.A05 = str;
        this.A00 = rectF;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = r2;
        this.A06 = list;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Reel reel = (Reel) obj;
        0qQ.A0B(reel, 0);
        C330367Mm r4 = this.A02;
        String str = this.A05;
        RectF rectF = this.A00;
        String str2 = this.A04;
        String str3 = this.A03;
        r4.A05.post(new C51550Fvw(rectF, this.A01, r4, reel, r4.A08, str, str2, str3, this.A06));
    }
}
