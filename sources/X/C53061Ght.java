package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.Ght  reason: case insensitive filesystem */
public final class C53061Ght extends PagingDataAdapter {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final C59615JQj A03;
    public final C55673HlW A04;
    public final Integer A05;
    public final Integer A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.clips_template_browser_clips_item_layout, viewGroup, false);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A02;
        0qQ.A0A(inflate);
        return new C53152GjO(inflate, userSession);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r34, int i) {
        1Xj r1;
        C67231sQ A0n;
        C2605946h A1O;
        Integer num;
        C53152GjO gjO = (C53152GjO) r34;
        0qQ.A0B(gjO, 0);
        gjO.itemView.getLayoutParams().width = this.A01;
        gjO.itemView.getLayoutParams().height = this.A00;
        Integer num2 = this.A05;
        if (!(num2 == null || (num = this.A06) == null)) {
            int intValue = num2.intValue();
            int intValue2 = num.intValue();
            gjO.A0D.setCornerRadius(intValue);
            gjO.A05.setBackgroundColor(intValue2);
        }
        View A0b = AnonymousClass7TE.A0b(gjO.itemView, R.id.template_browser_video_image_placeholder);
        int i2 = i;
        C267324bN r2 = (C267324bN) A02(i2);
        if (r2 != null && (r1 = r2.A02) != null) {
            boolean z = this.A08;
            boolean z2 = this.A0A;
            boolean z3 = this.A09;
            int i3 = 0;
            gjO.A00 = r1;
            gjO.A02 = Integer.valueOf(i2);
            if (z) {
                Context context = gjO.A03;
                0qQ.A06(context);
                IgTextView igTextView = gjO.A08;
                0qQ.A0B(igTextView, 2);
                UserSession userSession = gjO.A07;
                C67231sQ A0n2 = C51966G9m.A0n(r1);
                if (A0n2 == null || (((A0n = C51966G9m.A0n(r1)) == null || C291335gz.A01(A0n) == null) && ((A1O = r1.A1O()) == null || A1O.ACv(context).length() <= 0))) {
                    igTextView.setVisibility(8);
                    igTextView.setSelected(false);
                } else {
                    String A042 = AnonymousClass3ZJ.A04(A0n2.BUr(), A0n2.BZB());
                    String A032 = AnonymousClass3ZJ.A03(A0n2.BUr(), A0n2.BZB());
                    boolean A0A2 = AnonymousClass3ZJ.A0A(A0n2);
                    AnonymousClass4Ke r17 = new AnonymousClass4Ke(AnonymousClass3ZJ.A00(A0n2.BZB()), A0n2.AZY(), A042, A032, R.dimen.abc_text_size_menu_header_material, false, A0A2, false, false, true, true, AnonymousClass3ZJ.A0D(userSession, r1), C263304Kd.A03(A0n2), false);
                    igTextView.setText(AnonymousClass4Kf.A03(AnonymousClass7TF.A0A(context), AnonymousClass4Kf.A01(context, r17), AnonymousClass4Kf.A00(context, r17), userSession, r17, false));
                    igTextView.setVisibility(0);
                    igTextView.setSelected(true);
                }
            }
            Context context2 = gjO.A03;
            0qQ.A06(context2);
            SimpleVideoLayout simpleVideoLayout = gjO.A0C;
            IgImageView igImageView = gjO.A0B;
            int A022 = DbW.A02(1, simpleVideoLayout, igImageView);
            0xG r13 = gjO.A06;
            UserSession userSession2 = gjO.A07;
            0qQ.A0B(r13, 3);
            simpleVideoLayout.setVideoSource(r1, r13);
            ExtendedImageUrl A1n = r1.A1n(context2);
            if (A1n == null && (A1n = r1.A1l()) == null) {
                throw AnonymousClass7TE.A0y();
            }
            igImageView.setUrl(A1n, r13);
            if (z2) {
                IgTextView igTextView2 = gjO.A09;
                IgImageView igImageView2 = gjO.A0A;
                0qQ.A0B(igTextView2, 1);
                0qQ.A0B(igImageView2, A022);
                User A2A = r1.A2A(userSession2);
                if (A2A != null) {
                    String AyM = r2.AyM(userSession2);
                    if (AyM != null) {
                        SpannableStringBuilder A0C = DbS.A0C(AyM);
                        if (A2A.isVerified()) {
                            C244273av.A08(context2, A0C, false);
                        }
                        igTextView2.setText(A0C);
                        DbU.A1S(r13, igImageView2, A2A);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    i3 = 8;
                }
                igTextView2.setVisibility(i3);
                igImageView2.setVisibility(i3);
            }
            if (z3) {
                if (r1.CbC()) {
                    gjO.A00();
                } else {
                    gjO.A01();
                }
            }
            View view = gjO.itemView;
            view.findViewById(R.id.template_browser_clips_item_shimmer_view).setVisibility(8);
            if (z3) {
                View findViewById = view.findViewById(R.id.save_icon);
                findViewById.setVisibility(0);
                ID0.A00(findViewById, r2, A0b, this, 28);
            }
            AnonymousClass0fU.A00(new C56760IBj(i2, 4, r2, this), view);
            C59615JQj jQj = this.A03;
            String str = this.A04.A00;
            jQj.D3k(gjO, str);
            if (this.A07) {
                C55800Hng A002 = HWS.A00(this.A02);
                int hashCode = hashCode();
                Set set = A002.A02;
                Integer valueOf = Integer.valueOf(hashCode);
                if (!set.contains(valueOf)) {
                    set.add(valueOf);
                    Long l = A002.A01;
                    if (l != null) {
                        C51965G9l.A0a(A002.A04).flowMarkPoint(l.longValue(), 002.A0R("SECTION_INIT_", str));
                    }
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r2) {
        C53152GjO gjO = (C53152GjO) r2;
        0qQ.A0B(gjO, 0);
        this.A03.D3n(gjO);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53061Ght(com.instagram.common.session.UserSession r3, X.C59615JQj r4, X.C55673HlW r5, java.lang.Integer r6, java.lang.Integer r7, int r8, int r9, boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
            r2 = this;
            X.C51972G9s.A1B(r3, r4)
            X.Ghv r1 = X.C53063Ghv.A00
            X.4CZ r0 = X.AnonymousClass12W.A00
            X.134 r0 = X.AnonymousClass12y.A00
            r2.<init>(r1, r0)
            r2.A02 = r3
            r2.A01 = r8
            r2.A00 = r9
            r2.A03 = r4
            r2.A04 = r5
            r2.A07 = r10
            r2.A05 = r6
            r2.A06 = r7
            r2.A08 = r11
            r2.A0A = r12
            r2.A09 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53061Ght.<init>(com.instagram.common.session.UserSession, X.JQj, X.HlW, java.lang.Integer, java.lang.Integer, int, int, boolean, boolean, boolean, boolean):void");
    }
}
