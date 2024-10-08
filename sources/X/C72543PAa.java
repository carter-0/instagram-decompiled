package X;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.PAa  reason: case insensitive filesystem */
public final class C72543PAa implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7DZ A01;

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r10, AnonymousClass7FW r11) {
        CharSequence charSequence;
        AnonymousClass776 r1;
        float f;
        C67704MtI r0;
        ImageUrl imageUrl;
        Float f2;
        String str;
        C72571PBc pBc = (C72571PBc) r10;
        C328667Fr r112 = (C328667Fr) r11;
        IgImageView igImageView = pBc.A04;
        Context context = igImageView.getContext();
        AnonymousClass74T r6 = r112.A0D;
        TextView textView = pBc.A02;
        if (r6 != null) {
            charSequence = r6.A09;
        } else {
            charSequence = "";
        }
        textView.setText(charSequence);
        RoundedCornerFrameLayout roundedCornerFrameLayout = pBc.A05;
        int color = roundedCornerFrameLayout.getContext().getColor(2Yu.A0E(context));
        String str2 = null;
        if (r6 != null) {
            try {
                str = r6.A0E;
            } catch (IllegalArgumentException unused) {
                0wb.A03("CardBubbleXma", "Invalid title text color");
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            color = Color.parseColor(str);
        }
        textView.setTextColor(color);
        AnonymousClass777 r12 = r112.A0F;
        if (r12 instanceof AnonymousClass776) {
            r1 = (AnonymousClass776) r12;
        } else {
            r1 = null;
        }
        float A09 = ((float) 0nA.A09(context)) / 2.5f;
        if (r1 == null || (f2 = r1.A02) == null) {
            igImageView.A09();
            f = 0.75f;
        } else {
            igImageView.setUrl(r1.A00, this.A00);
            igImageView.A0A = new C247833gz();
            f = f2.floatValue();
        }
        0nA.A0f(roundedCornerFrameLayout, (int) A09);
        0nA.A0V(roundedCornerFrameLayout, (int) (A09 / f));
        if (r6 == null || (imageUrl = r6.A01) == null) {
            pBc.A03.A09();
        } else {
            IgImageView igImageView2 = pBc.A03;
            igImageView2.setUrl(imageUrl, this.A00);
            0nA.A0f(igImageView2, DbS.A02(context, imageUrl.getWidth()));
            0nA.A0V(igImageView2, DbS.A02(context, imageUrl.getHeight()));
        }
        float[] fArr = C3265577g.A01(context, r112.A0C).A01;
        roundedCornerFrameLayout.A01(fArr[0], fArr[2], fArr[4], fArr[6]);
        AnonymousClass9J6 r02 = r112.A06;
        String str3 = null;
        if (r02 != null) {
            str2 = r02.A01;
            str3 = r02.A00;
        }
        roundedCornerFrameLayout.setContentDescription(str2);
        if (str3 != null) {
            r0 = new C67704MtI(str3, 0);
        } else {
            r0 = new 02Z();
        }
        03v.A0B(roundedCornerFrameLayout, r0);
        this.A01.A02(pBc, r112);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        C72571PBc pBc = (C72571PBc) r2;
        pBc.A04.A09();
        pBc.A03.A09();
        this.A01.A01(pBc);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.7XR, X.7XA, X.7XX] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72543PAa(X.AnonymousClass0iw r8, X.AnonymousClass7XA r9, X.AnonymousClass9HC r10) {
        /*
            r7 = this;
            r7.<init>()
            r6 = r10
            boolean r1 = r10.A1X
            X.77j r0 = new X.77j
            r0.<init>(r1)
            X.P89 r2 = new X.P89
            r5 = r9
            r2.<init>(r7, r9)
            X.77k r3 = r0.A00(r9)
            X.7DV r4 = new X.7DV
            r4.<init>(r9, r1)
            X.77l r1 = new X.77l
            r1.<init>(r2, r3, r4, r5, r6)
            X.7DY[] r0 = new X.AnonymousClass7DY[]{r1, r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            X.7DZ r0 = new X.7DZ
            r0.<init>(r1)
            r7.A01 = r0
            r7.A00 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72543PAa.<init>(X.0iw, X.7XA, X.9HC):void");
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.direct_card_bubble_xma_message);
        AnonymousClass7PV.A01(A0C);
        C72571PBc pBc = new C72571PBc(A0C);
        this.A01.A00(pBc);
        return pBc;
    }
}
