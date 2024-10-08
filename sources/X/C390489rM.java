package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;

/* renamed from: X.9rM  reason: invalid class name and case insensitive filesystem */
public final class C390489rM extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelIFYShareFragment";
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public RectF A07;
    public RectF A08;
    public String A09;
    public final C41837B2s A0A = new WUP(this, 20);

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        CameraTool cameraTool;
        C356888Vp r9;
        String str;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 0);
        if (!182.A06(0Tu.A05, AnonymousClass7TE.A0k(this), 36328349513891093L) || (str = this.A02) == null || str.length() == 0) {
            cameraTool = CameraTool.MEMU_IN_FEED;
        } else {
            cameraTool = CameraTool.MEMU_IN_FEED_WITH_MIMICRY;
        }
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0C(A002, this.A0A, this);
        AnonymousClass80D.A09(AnonymousClass7TE.A0k(this), AnonymousClass80H.A02, A002, this);
        A002.A09 = viewGroup2;
        A002.A0B = 28D.A3Q;
        A002.A0O = this;
        AnonymousClass80D.A02(this.A07, this.A08, A002);
        A002.A3y = true;
        A002.A3g = true;
        String str2 = this.A00;
        A002.A2U = str2;
        String str3 = this.A01;
        if (str3 != null) {
            if (str2 == null) {
                str2 = "";
            }
            String str4 = this.A02;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = this.A04;
            String str6 = this.A05;
            String str7 = str6;
            String str8 = str5;
            String str9 = str4;
            r9 = new C356888Vp((C63968LFv) null, (LG4) null, AnonymousClass05K.A01, AnonymousClass05K.A0N, str2, str3, str3, str9, str8, str7, "", (String) null, (String) null, this.A06, this.A03, 1280, 1280, false);
        } else {
            r9 = null;
        }
        A002.A1z = r9;
        A002.A3Q = true;
        A002.A2i = this.A09;
        A002.A0y = AnonymousClass80E.ALL;
        A002.A0I = new GenAIToolInfoDict(cameraTool, (String) null, (String) null, this.A02, this.A03, this.A04, this.A05, (String) null, this.A06);
        return A002;
    }

    public final String getModuleName() {
        return "reel_ify_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1907168218);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A07 = (RectF) bundle2.getParcelable(AnonymousClass000.A00(468));
            this.A08 = (RectF) bundle2.getParcelable(AnonymousClass000.A00(469));
            this.A01 = bundle2.getString(AnonymousClass000.A00(2441), (String) null);
            this.A00 = bundle2.getString(AnonymousClass000.A00(2440), (String) null);
            this.A09 = bundle2.getString(AnonymousClass000.A00(470));
            this.A04 = bundle2.getString(AnonymousClass000.A00(2444), (String) null);
            this.A05 = bundle2.getString(AnonymousClass000.A00(2445), (String) null);
            this.A02 = bundle2.getString(AnonymousClass000.A00(2442));
            this.A03 = bundle2.getString(AnonymousClass000.A00(2443));
            this.A06 = bundle2.getString(AnonymousClass000.A00(2446));
            AnonymousClass0fD.A09(-1109478284, A022);
            return;
        }
        IllegalArgumentException A0w = AnonymousClass7TE.A0w(AnonymousClass000.A00(459));
        AnonymousClass0fD.A09(857357441, A022);
        throw A0w;
    }
}
