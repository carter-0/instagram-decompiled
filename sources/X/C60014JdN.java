package X;

import android.location.Location;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.model.venue.Venue;
import java.util.List;

/* renamed from: X.JdN  reason: case insensitive filesystem */
public final class C60014JdN extends ClickableSpan {
    public final int A00;
    public final Object A01;

    public C60014JdN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        C309516Yo r1;
        Double A2G;
        switch (this.A00) {
            case 0:
                C68630NQj nQj = (C68630NQj) this.A01;
                C307326Pr r12 = nQj.A01;
                if (r12 != null) {
                    AnonymousClass9JF r2 = nQj.A06;
                    0qQ.A0B(r2, 0);
                    0sP r13 = ((C307316Pq) r12).A00.A00;
                    if (r13 != null) {
                        r13.invoke(r2.A04);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                editMediaInfoFragment.A0I.getClass();
                Location location = new Location("photo");
                Venue venue = editMediaInfoFragment.A0L;
                if (venue != null && venue.A00() != null && editMediaInfoFragment.A0L.A01() != null) {
                    location.setLatitude(editMediaInfoFragment.A0L.A00().doubleValue());
                    A2G = editMediaInfoFragment.A0L.A01();
                } else if (editMediaInfoFragment.A0I.A2F() == null || editMediaInfoFragment.A0I.A2G() == null) {
                    location = editMediaInfoFragment.A01;
                    r1 = Dbb.A0G(editMediaInfoFragment);
                    AnonymousClass36R.A01();
                    r1.A0E(K5H.A00(location, "EDIT_POST", (String) null, editMediaInfoFragment.A0I.A1A(), false, false));
                    r1.A0C = K5H.class.getCanonicalName();
                    break;
                } else {
                    location.setLatitude(editMediaInfoFragment.A0I.A2F().doubleValue());
                    A2G = editMediaInfoFragment.A0I.A2G();
                }
                location.setLongitude(A2G.doubleValue());
                r1 = Dbb.A0G(editMediaInfoFragment);
                AnonymousClass36R.A01();
                r1.A0E(K5H.A00(location, "EDIT_POST", (String) null, editMediaInfoFragment.A0I.A1A(), false, false));
                r1.A0C = K5H.class.getCanonicalName();
                break;
            case 2:
                EditMediaInfoFragment editMediaInfoFragment2 = (EditMediaInfoFragment) this.A01;
                1Xj r0 = editMediaInfoFragment2.A0I;
                if (r0 == null || !r0.A5P()) {
                    JVF.A02(editMediaInfoFragment2, editMediaInfoFragment2.getSession(), AnonymousClass05K.A0H, AnonymousClass05K.A0C, LPL.A00(editMediaInfoFragment2.getSession()));
                    if (AnonymousClass430.A00(editMediaInfoFragment2.getSession())) {
                        UserSession session = editMediaInfoFragment2.getSession();
                        List list = editMediaInfoFragment2.A0g;
                        BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = editMediaInfoFragment2.A05;
                        BrandedContentGatingInfoIntf brandedContentGatingInfoIntf = editMediaInfoFragment2.A04;
                        boolean z = editMediaInfoFragment2.A0q;
                        String str = editMediaInfoFragment2.A0R;
                        AnonymousClass7TG.A1O(session, list);
                        Fragment A002 = LLA.A00(brandedContentGatingInfoIntf, brandedContentProjectMetadataIntf, session, str, "feed", list, false, false, true, false, z);
                        r1 = Dbb.A0G(editMediaInfoFragment2);
                        r1.A0E(A002);
                        break;
                    } else {
                        FragmentActivity activity = editMediaInfoFragment2.getActivity();
                        activity.getClass();
                        C358248ab A0X = DbS.A0X(activity);
                        A0X.A09(2131971998);
                        A0X.A08(2131971999);
                        LV3.A01(A0X, editMediaInfoFragment2, 49, 2131971974);
                        A0X.A05();
                        DbT.A1V(A0X);
                        return;
                    }
                } else {
                    LM3.A00(new LM3(editMediaInfoFragment2.requireContext()), 2131961824, 2131961795);
                    return;
                }
            default:
                C60317JjL jjL = (C60317JjL) ((K74) this.A01).A04.getValue();
                05G r22 = jjL.A07;
                C61032JvW jvW = (C61032JvW) C60317JjL.A00(jjL);
                boolean z2 = ((C61032JvW) C60317JjL.A00(jjL)).A08;
                boolean z3 = ((C61032JvW) C60317JjL.A00(jjL)).A0A;
                boolean z4 = jvW.A06;
                List list2 = (List) jvW.A03;
                List list3 = (List) jvW.A01;
                List list4 = (List) jvW.A02;
                boolean z5 = jvW.A05;
                String str2 = jvW.A04;
                boolean z6 = jvW.A08;
                boolean z7 = jvW.A0A;
                AnonymousClass7TG.A1U(list2, list3, list4);
                r22.Epw(new C61032JvW(str2, list2, list3, list4, z4, z5, z6, z2, z7, z3));
                return;
        }
        r1.A04();
    }

    public final void updateDrawState(TextPaint textPaint) {
        switch (this.A00) {
            case 1:
            case 2:
                textPaint.setUnderlineText(false);
                AnonymousClass7TE.A1N(DbT.A08(this.A01), textPaint, R.color.badge_color);
                return;
            case 3:
                DbW.A0u(textPaint);
                textPaint.setFakeBoldText(true);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }
}
