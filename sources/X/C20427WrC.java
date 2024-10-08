package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.model.LeadGenTrustSignal;
import com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload;
import java.util.List;

/* renamed from: X.WrC  reason: case insensitive filesystem */
public final class C20427WrC implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C20427WrC(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A01 = obj4;
        this.A03 = obj5;
        this.A02 = obj6;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r16) {
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload;
        IgTextView igTextView;
        Context context;
        Drawable A0E;
        Context context2;
        String string;
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload2;
        LeadGenTrustSignal leadGenTrustSignal;
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload3;
        LeadGenTrustSignal leadGenTrustSignal2;
        String str5;
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload4;
        LeadGenTrustSignal leadGenTrustSignal3;
        ImageUrl imageUrl;
        if (this.A00 != 0) {
            LeadGenProfileContentInfo leadGenProfileContentInfo = (LeadGenProfileContentInfo) obj;
            TextView textView = (TextView) this.A04;
            if (leadGenProfileContentInfo != null) {
                str = leadGenProfileContentInfo.A02;
            } else {
                str = null;
            }
            textView.setText(str);
            if (!(leadGenProfileContentInfo == null || (imageUrl = leadGenProfileContentInfo.A00) == null)) {
                ((IgImageView) this.A01).setUrl(imageUrl, (AnonymousClass4DH) this.A06);
            }
            UZ6 uz6 = (UZ6) this.A06;
            IgTextView igTextView2 = (IgTextView) this.A02;
            if (leadGenProfileContentInfo == null || (leadGenTrustSignalsPayload4 = leadGenProfileContentInfo.A01) == null || (leadGenTrustSignal3 = leadGenTrustSignalsPayload4.A00) == null) {
                str2 = null;
            } else {
                str2 = leadGenTrustSignal3.A02;
            }
            UZ6.A00(igTextView2, str2);
            if (leadGenProfileContentInfo == null || (leadGenTrustSignalsPayload3 = leadGenProfileContentInfo.A01) == null || (leadGenTrustSignal2 = leadGenTrustSignalsPayload3.A02) == null || (str5 = leadGenTrustSignal2.A02) == null) {
                num = null;
            } else {
                num = 00y.A0l(str5);
            }
            IgTextView igTextView3 = (IgTextView) this.A03;
            if (num != null) {
                str3 = DbV.A0z(uz6, C253673rC.A03(JTR.A0R(uz6), Integer.valueOf(num.intValue())), 2131964825);
            } else {
                str3 = null;
            }
            UZ6.A00(igTextView3, str3);
            IgTextView igTextView4 = uz6.A00;
            if (leadGenProfileContentInfo == null || (leadGenTrustSignalsPayload2 = leadGenProfileContentInfo.A01) == null || (leadGenTrustSignal = leadGenTrustSignalsPayload2.A01) == null) {
                str4 = null;
            } else {
                str4 = leadGenTrustSignal.A02;
            }
            UZ6.A00(igTextView4, str4);
            if (!(leadGenProfileContentInfo == null || (leadGenTrustSignalsPayload = leadGenProfileContentInfo.A01) == null)) {
                View view = (View) this.A05;
                List<LeadGenTrustSignal> list = leadGenTrustSignalsPayload.A05;
                ViewGroup A0I = DbX.A0I(view, R.id.profile_content_trust_signals_list);
                A0I.removeAllViews();
                for (LeadGenTrustSignal leadGenTrustSignal4 : list) {
                    String str6 = leadGenTrustSignal4.A02;
                    if (!(str6 == null || str6.length() == 0)) {
                        U6j u6j = new U6j(AnonymousClass7TE.A0S(view));
                        C16611Uy7 uy7 = leadGenTrustSignal4.A01;
                        Integer num2 = uy7.A01;
                        if (num2 == null || (string = context2.getString(num2.intValue())) == null) {
                            igTextView = u6j.A00;
                        } else {
                            String A0d = AnonymousClass7TF.A0d((context2 = u6j.getContext()).getResources(), 2131961000);
                            igTextView = u6j.A00;
                            str6 = 00k.A0P(A0d, "", "", C66581MXm.A11(string, str6), (0sP) null);
                        }
                        igTextView.setText(str6);
                        Integer num3 = uy7.A00;
                        Drawable drawable = null;
                        if (!(num3 == null || (A0E = JTP.A0E(context, num3)) == null)) {
                            DbX.A11(context, A0E, 2Yu.A0B((context = u6j.getContext())));
                            drawable = A0E;
                        }
                        u6j.A01.setImageDrawable(drawable);
                        WBG.A01(u6j, 50, uz6, leadGenTrustSignal4);
                        A0I.addView(u6j);
                    }
                }
            }
        } else {
            C59721JVf jVf = (C59721JVf) obj;
            int ordinal = ((C54617HLa) jVf.A00).ordinal();
            if (ordinal == 0) {
                View view2 = (View) this.A05;
                0qQ.A0A(view2);
                view2.setVisibility(0);
                View view3 = (View) this.A04;
                0qQ.A0A(view3);
                view3.setVisibility(8);
            } else if (ordinal != 2) {
                if (ordinal == 1) {
                    C52369GPq.A03((C52369GPq) ((C54158H1c) this.A06).A00.getValue(), (Long) null, "learn_more_bottom_sheet_impression");
                    View view4 = (View) this.A05;
                    0qQ.A0A(view4);
                    view4.setVisibility(8);
                    View view5 = (View) this.A04;
                    0qQ.A0A(view5);
                    view5.setVisibility(0);
                    QP8 qp8 = (QP8) jVf.A01;
                    if (qp8 != null) {
                        IgdsBulletCell igdsBulletCell = (IgdsBulletCell) this.A03;
                        IgdsBulletCell igdsBulletCell2 = (IgdsBulletCell) this.A02;
                        ((IgdsBulletCell) this.A01).setText((CharSequence) null, (CharSequence) qp8.A01);
                        igdsBulletCell.setText((CharSequence) null, (CharSequence) qp8.A04);
                        igdsBulletCell.setIcon((int) R.drawable.instagram_warning_pano_outline_24);
                        igdsBulletCell2.setText((CharSequence) null, (CharSequence) AnonymousClass7AV.A00((Uri) qp8.A00, qp8.A03, qp8.A02));
                        igdsBulletCell2.setIcon((int) R.drawable.instagram_lock_pano_outline_24);
                        igdsBulletCell2.setMovementMethod((MovementMethod) null, LinkMovementMethod.getInstance());
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return C60340gF.A00;
    }
}
