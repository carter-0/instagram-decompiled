package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.4Wf  reason: invalid class name and case insensitive filesystem */
public abstract class C265774Wf {
    public static final void A00(UserSession userSession, C265754Wd r20, AnonymousClass4WO r21, C249693kD r22) {
        String str;
        String str2;
        List list;
        String C9a;
        AnonymousClass4WO r6 = r21;
        0qQ.A0B(r6, 1);
        C249693kD r5 = r22;
        List<C255783ui> Bkd = r5.Bkd(AnonymousClass3WT.CLIPS_TEXT);
        if (Bkd == null || Bkd.isEmpty()) {
            C252063oV r1 = r6.A07;
            if (r1.CVM()) {
                AnonymousClass4WO.A00(r6).removeAllViews();
            }
            r1.setVisibility(8);
            return;
        }
        C252063oV r3 = r6.A07;
        r3.setVisibility(0);
        String str3 = r6.A00;
        1Xj BPf = r5.BPf();
        if (BPf != null) {
            str = BPf.getId();
        } else {
            str = null;
        }
        UserSession userSession2 = userSession;
        if (!0qQ.A0K(str3, str)) {
            r6.A04 = false;
            r6.A05 = AnonymousClass3WS.A07(userSession2);
        }
        1Xj BPf2 = r5.BPf();
        if (BPf2 != null) {
            str2 = BPf2.getId();
        } else {
            str2 = null;
        }
        r6.A00 = str2;
        AnonymousClass4WO.A00(r6).removeAllViews();
        float AcY = r5.AcY(userSession2);
        C265754Wd r8 = r20;
        AnonymousClass4WO r13 = r6;
        r6.A03 = new C59137J7t(19, r13, r5, userSession2, r8);
        r6.A01 = new C58695Iw4(19, (Object) r5, (Object) r6, (Object) r8);
        r6.A02 = new MPB(14, (Object) userSession2, (Object) r6);
        for (C255783ui r12 : Bkd) {
            C42117BHv bHv = r12.A0g;
            if (!(bHv == null || (list = bHv.A09) == null || list.isEmpty() || (C9a = ((C46270DSz) list.get(0)).C9a()) == null || C9a.length() == 0)) {
                LayoutInflater from = LayoutInflater.from(r3.getView().getContext());
                View inflate = from.inflate(R.layout.translated_text_sticker_image_view, (ViewGroup) null, false);
                0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView = (ImageView) inflate;
                imageView.setTag(new C45384CvQ(bHv, r12.A1K, r12.A1J, C9a));
                View inflate2 = from.inflate(R.layout.translated_text_sticker_touch_lauout, (ViewGroup) null, false);
                inflate2.setTag(new C45384CvQ((C46318DUv) null, r12.A1K, r12.A1J, (String) null));
                imageView.getViewTreeObserver().addOnGlobalLayoutListener(new C64299LYz(inflate2, imageView, r6, r12, AcY));
                AnonymousClass4WO.A03(userSession2, r6, Boolean.valueOf(r6.A05), Float.valueOf(0.0f), new 0hJ(new View[]{imageView, inflate2}));
                AnonymousClass4WO.A02(imageView, inflate2, AnonymousClass4WO.A01(r6), r12, AcY);
                AnonymousClass0fU.A00(new IBQ(r8, r6, r5), inflate2);
                AnonymousClass4WO.A00(r6).addView(imageView);
                AnonymousClass4WO.A00(r6).addView(inflate2);
            }
        }
    }

    public static final void A01(AnonymousClass4WO r2) {
        0qQ.A0B(r2, 0);
        C252063oV r1 = r2.A07;
        if (r1.CVM()) {
            AnonymousClass4WO.A00(r2).removeAllViews();
        }
        r1.setVisibility(8);
    }
}
