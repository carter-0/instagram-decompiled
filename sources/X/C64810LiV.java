package X;

import android.view.View;
import java.util.List;

/* renamed from: X.LiV  reason: case insensitive filesystem */
public final class C64810LiV implements C232262tL {
    public final View.OnClickListener A00;
    public final C47567E8f A01;
    public final C358618bC A02;
    public final CharSequence A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 002.A0R("video_metadata_sharing_", this.A04);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64810LiV liV = (C64810LiV) obj;
        0qQ.A0B(liV, 0);
        if (!2PP.A00(this.A04, liV.A04) || !2PP.A00(this.A03, liV.A03) || !2PP.A00(this.A06, liV.A06) || !2PP.A00(Boolean.valueOf(this.A0A), Boolean.valueOf(liV.A0A)) || this.A07 != liV.A07 || !2PP.A00(this.A02, liV.A02) || !2PP.A00(this.A01, liV.A01) || !2PP.A00(Boolean.valueOf(this.A08), Boolean.valueOf(liV.A08)) || !2PP.A00(this.A00, liV.A00) || !2PP.A00(this.A05, liV.A05) || !2PP.A00(Boolean.valueOf(this.A09), Boolean.valueOf(liV.A09))) {
            return false;
        }
        return true;
    }

    public C64810LiV(View.OnClickListener onClickListener, C47567E8f e8f, C358618bC r3, CharSequence charSequence, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = str;
        this.A03 = charSequence;
        this.A06 = list;
        this.A0A = z;
        this.A07 = z2;
        this.A02 = r3;
        this.A01 = e8f;
        this.A08 = z3;
        this.A00 = onClickListener;
        this.A05 = str2;
        this.A09 = z4;
    }
}
