package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IceBreakerMessageIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.common.session.UserSession;

public final class FOB implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public FOB(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A00 = i;
        this.A04 = obj4;
        this.A02 = obj;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A05 = z;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        String B96;
        String str;
        C52673Gal gal;
        int length;
        FragmentActivity requireActivity;
        AnonymousClass47L r10;
        UserSession A0l;
        int i3;
        switch (this.A00) {
            case 0:
                i2 = AnonymousClass0fD.A05(1155557751);
                IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = (IGCTMessagingAdsInfoDict) this.A01;
                if (iGCTMessagingAdsInfoDict != null) {
                    if (this.A05 || (i3 = ((C15366UbJ) this.A04).A00) == Integer.MAX_VALUE) {
                        OnFeedMessagesIntf BTY = iGCTMessagingAdsInfoDict.BTY();
                        if (BTY != null) {
                            B96 = BTY.B96();
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    } else {
                        OnFeedMessagesIntf BTY2 = iGCTMessagingAdsInfoDict.BTY();
                        if (BTY2 != null) {
                            B96 = ((IceBreakerMessageIntf) AnonymousClass3ZO.A01(BTY2).get(i3)).getActionUrl();
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                    OnFeedMessagesIntf onFeedMessagesIntf = (OnFeedMessagesIntf) this.A03;
                    if (onFeedMessagesIntf != null) {
                        str = AnonymousClass3ZN.A00(onFeedMessagesIntf);
                    } else {
                        str = "";
                    }
                    if (!(B96 == null || (length = B96.length()) == 0)) {
                        boolean equals = str.equals("WHATSAPP");
                        C15366UbJ ubJ = (C15366UbJ) this.A04;
                        if (equals) {
                            A0l = AnonymousClass7TE.A0l(ubJ.A0J);
                            requireActivity = ubJ.requireActivity();
                            if (length > 0) {
                                r10 = AnonymousClass47L.AD_DESTINATION_DEEPLINK;
                            }
                        } else {
                            requireActivity = ubJ.requireActivity();
                            r10 = AnonymousClass47L.AD_DESTINATION_DEEPLINK;
                            A0l = AnonymousClass7TE.A0l(ubJ.A0J);
                        }
                        FH7.A06(requireActivity, A0l, r10, (C49716F3b) null, B96, (String) null);
                    }
                    if (!(onFeedMessagesIntf == null || (gal = (C52673Gal) this.A02) == null)) {
                        String str2 = ((C15366UbJ) this.A04).A09;
                        if (str2 == null) {
                            str2 = "-1";
                        }
                        gal.A06((Long) null, str2, (String) null, str, C16947VBz.A00(iGCTMessagingAdsInfoDict));
                    }
                }
                i = 1883769365;
                break;
            case 1:
                i2 = AnonymousClass0fD.A05(-1576120712);
                C2367234v r6 = (C2367234v) this.A04;
                C2365134a r1 = r6.A08;
                r1.A08(true);
                r6.A07.A03(r1.A03.A04, AnonymousClass000.A00(1437));
                View view2 = (View) this.A02;
                view2.setOnClickListener((View.OnClickListener) null);
                ((ViewGroup) this.A01).removeView(view2);
                ((View) this.A03).setTranslationX(0.0f);
                if (this.A05) {
                    0xY A0N = AnonymousClass7TF.A0N(r6.A06);
                    A0N.E5T("has_seen_group_stories_peek_nux", true);
                    A0N.apply();
                }
                i = -907117592;
                break;
            default:
                boolean z = this.A05;
                Fragment fragment = (Fragment) this.A01;
                EXD exd = (EXD) this.A02;
                0lg r3 = (0lg) this.A03;
                C46634DiE diE = (C46634DiE) this.A04;
                if (z) {
                    DbT.A1K(fragment);
                    return;
                }
                FGJ.A03.A05(view.getContext());
                C49958FGq.A04(fragment.mArguments, fragment.mFragmentManager);
                if (exd != null) {
                    C49227ErW.A00(r3, exd, diE.A01);
                }
                C49843F9i.A00 = null;
                C49913FEl.A02(fragment.requireContext());
                return;
        }
        AnonymousClass0fD.A0C(i, i2);
    }
}
