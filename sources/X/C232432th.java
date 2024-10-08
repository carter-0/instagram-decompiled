package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.mainfeed.afi.ui.AfiSecondaryLinkButton;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;
import java.util.List;
import java.util.Map;

/* renamed from: X.2th  reason: invalid class name and case insensitive filesystem */
public final class C232432th extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C230582pr A03;
    public final C249763kK A04;
    public final C230662pz A05;

    public C232432th(Context context, AnonymousClass0iw r3, UserSession userSession, C230582pr r5, C249763kK r6, C230662pz r7) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r6, 3);
        0qQ.A0B(r5, 5);
        0qQ.A0B(r7, 6);
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = r6;
        this.A01 = r3;
        this.A03 = r5;
        this.A05 = r7;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Integer num;
        int intValue;
        Object obj3 = obj2;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(750234066);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0B(obj4, 2);
        0qQ.A0B(obj3, 3);
        C57280IVp iVp = (C57280IVp) obj4;
        C57244IUf iUf = (C57244IUf) obj3;
        UserSession userSession = this.A02;
        IL4 il4 = new IL4(this.A01, userSession, iVp, this.A04.getSessionId());
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.afi.ui.AfiInterestsPickerViewBinder.Holder");
        C55834HoH hoH = (C55834HoH) tag;
        C230582pr r13 = this.A03;
        C230642px r11 = r13.A03;
        r11.A00 = il4;
        C230652py r10 = r13.A04;
        r10.A00 = il4;
        View view3 = hoH.A00;
        C55641Hl0 hl0 = new C55641Hl0(iVp, hoH);
        0qQ.A0B(iVp, 1);
        String A002 = C230582pr.A00(iVp);
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r02 = new C2354830a(iVp, hl0, A002);
        r02.A00(r11);
        r02.A00(r10);
        r13.A00.A05(view3, r02.A01());
        Context context = this.A00;
        C230662pz r8 = this.A05;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(iUf, 4);
        0qQ.A0B(r8, 5);
        C269904fs r102 = iVp.A00;
        String title = r102.getTitle();
        if (title == null) {
            title = context.getString(2131964436);
            0qQ.A07(title);
        }
        hoH.A02.setText(title);
        String subtitle = r102.getSubtitle();
        if (subtitle == null || subtitle.length() == 0) {
            hoH.A01.setVisibility(8);
        } else {
            IgTextView igTextView = hoH.A01;
            igTextView.setVisibility(0);
            igTextView.setText(subtitle);
        }
        String id = iVp.getId();
        AnonymousClass0fU.A00(new IBS(il4, r8, id), hoH.A03);
        List<JSM> BIP = r102.BIP();
        if (BIP != null) {
            Integer num2 = iUf.A00;
            Integer num3 = AnonymousClass05K.A01;
            if (num2 == num3) {
                num = r102.B2c();
                if (num == null) {
                    intValue = 5;
                }
                intValue = num.intValue();
            } else {
                num = r102.BXG();
                if (num == null) {
                    intValue = 3;
                }
                intValue = num.intValue();
            }
            boolean A06 = 182.A06(0Tu.A05, userSession, 36323521970056432L);
            HorizontalFlowLayout horizontalFlowLayout = hoH.A05;
            horizontalFlowLayout.removeAllViews();
            horizontalFlowLayout.A00 = intValue;
            int i2 = 0;
            for (JSM jsm : BIP) {
                int i3 = i2 + 1;
                Map map = iUf.A02;
                Object obj5 = map.get(Integer.valueOf(i2));
                HLH hlh = HLH.SELECTED;
                boolean z = false;
                if (obj5 == hlh) {
                    z = true;
                }
                if (!(jsm.getName() == null || jsm.getDisplayName() == null)) {
                    H7Y h7y = new H7Y(context, jsm, z, A06);
                    Context context2 = context;
                    IL4 il42 = il4;
                    AnonymousClass0fU.A00(new ICU(context2, il42, jsm, iUf, h7y, i2), h7y);
                    boolean isSelected = h7y.A01.isSelected();
                    Integer valueOf = Integer.valueOf(i2);
                    if (!isSelected) {
                        hlh = HLH.UNSELECTED;
                    }
                    map.put(valueOf, hlh);
                    horizontalFlowLayout.addView(h7y);
                }
                i2 = i3;
            }
            String B2Z = r102.B2Z();
            Integer B2c = r102.B2c();
            if (iUf.A00 != num3) {
                int i4 = 0;
                if (!(B2Z == null || B2Z.length() == 0)) {
                    AfiSecondaryLinkButton afiSecondaryLinkButton = hoH.A04;
                    afiSecondaryLinkButton.setText(B2Z);
                    Integer A052 = C14091Tpi.A05("chevron_down_pano_outline_12");
                    if (A052 != null) {
                        i4 = A052.intValue();
                    }
                    afiSecondaryLinkButton.A02(C273084lx.END, i4);
                    afiSecondaryLinkButton.setIconPadding(context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
                    AnonymousClass0fU.A00(new ICJ(il4, iUf, hoH, afiSecondaryLinkButton, B2c), afiSecondaryLinkButton);
                    AnonymousClass0fD.A0A(-1521640555, A032);
                    return;
                }
            }
            hoH.A04.setVisibility(8);
            AnonymousClass0fD.A0A(-1521640555, A032);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A7U(0);
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(1517615373);
        0qQ.A0B(viewGroup, 1);
        Context context = viewGroup.getContext();
        boolean A07 = C61670oa.A07();
        int i2 = R.layout.afi_interests_picker_view;
        if (A07) {
            i2 = R.layout.afi_interests_picker_view_prism;
        }
        View inflate = LayoutInflater.from(context).inflate(i2, viewGroup, false);
        0qQ.A0A(inflate);
        inflate.setTag(new C55834HoH(inflate));
        AnonymousClass0fD.A0A(371075738, A032);
        return inflate;
    }
}
