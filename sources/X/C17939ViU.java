package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.AudienceMessageEntityRange;
import com.instagram.api.schemas.AudienceValidationResponse;
import com.instagram.api.schemas.BoostedComponentMessageType;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.ViU  reason: case insensitive filesystem */
public final class C17939ViU {
    public boolean A00 = false;
    public boolean A01 = true;
    public final FragmentActivity A02;
    public final WGU A03;
    public final VZK A04;
    public final PromoteData A05;
    public final PromoteState A06;
    public final UserSession A07;
    public final IgRadioGroup A08;
    public final Map A09 = new HashMap();
    public final Map A0A = new HashMap();
    public final Map A0B = new HashMap();

    public C17939ViU(View view, FragmentActivity fragmentActivity, PromoteData promoteData, PromoteState promoteState) {
        AnonymousClass7TG.A1Q(promoteData, promoteState);
        this.A05 = promoteData;
        this.A06 = promoteState;
        this.A02 = fragmentActivity;
        UserSession userSession = promoteData.A0y;
        0qQ.A06(userSession);
        this.A07 = userSession;
        this.A08 = (IgRadioGroup) AnonymousClass7TF.A0F(view, R.id.audience_group);
        this.A04 = new VZK(fragmentActivity, AnonymousClass07i.A00(fragmentActivity), userSession, promoteData.A1A, promoteData.A1L);
        this.A03 = WGU.A00(userSession);
    }

    public final void A00() {
        int i;
        AudienceValidationResponse A032;
        List<AudienceMessageEntityRange> list;
        Integer BXp;
        String substring;
        String A0p;
        IgRadioGroup igRadioGroup = this.A08;
        igRadioGroup.removeAllViews();
        PromoteData promoteData = this.A05;
        List list2 = promoteData.A21;
        this.A01 = list2.isEmpty();
        if (list2.size() == 1 && AnonymousClass7TE.A13(list2) == SpecialRequirementCategory.A07) {
            this.A01 = true;
        }
        List<PromoteAudience> list3 = promoteData.A1m;
        0qQ.A06(list3);
        U5O u5o = null;
        for (PromoteAudience promoteAudience : list3) {
            if (W3x.A0P(promoteAudience)) {
                FragmentActivity fragmentActivity = this.A02;
                u5o = new U5O(fragmentActivity);
                u5o.setTag(BoostedPostAudienceOption.IG_PROMOTED_POST_AUTO.toString());
                UserSession userSession = this.A07;
                if (C18803W2r.A03(userSession)) {
                    u5o.setPrimaryText((CharSequence) AnonymousClass7TE.A16(fragmentActivity, 2131954038));
                    A0p = AnonymousClass7TE.A16(fragmentActivity, 2131954036);
                } else {
                    String str = promoteAudience.A07;
                    if (str != null) {
                        u5o.setPrimaryText((CharSequence) str);
                        if (182.A06(0Tu.A05, userSession, 36310894766129511L)) {
                            u5o.setSecondaryText(W3x.A0B(fragmentActivity, promoteAudience, promoteData));
                            u5o.A9W(new C19745Wem(u5o, 0));
                            igRadioGroup.addView(u5o);
                        } else {
                            int i2 = 2131970216;
                            if (promoteData.A0C()) {
                                i2 = 2131970217;
                            }
                            A0p = C51967G9n.A0p(fragmentActivity, i2);
                        }
                    } else {
                        throw new IllegalStateException("Automatic audience name can not be null");
                    }
                }
                u5o.setSecondaryText(A0p);
                u5o.A04(true);
                igRadioGroup.addView(u5o);
            } else {
                String str2 = promoteAudience.A05;
                if (str2 != null) {
                    FragmentActivity fragmentActivity2 = this.A02;
                    W9h w9h = null;
                    U5O u5o2 = new U5O(fragmentActivity2);
                    u5o2.setTag(promoteAudience.A05);
                    String str3 = promoteAudience.A07;
                    if (str3 != null) {
                        u5o2.setPrimaryText((CharSequence) str3);
                        u5o2.setSecondaryText(W3x.A0B(fragmentActivity2, promoteAudience, promoteData));
                        u5o2.setWarningText(W3x.A05(fragmentActivity2, C16678UzE.AUDIENCE_SELECTION, promoteAudience, promoteData));
                        W9h w9h2 = new W9h(str2, this, 2);
                        if (this.A01) {
                            u5o2.setActionLabel(AnonymousClass7TE.A16(fragmentActivity2, 2131970468), promoteData.A0y, w9h2);
                        }
                        if (this.A01) {
                            w9h = w9h2;
                        }
                        u5o2.setSubtitleContainerOnClickListener(w9h);
                        u5o2.A9W(new C19748Wep(this, promoteAudience, u5o2, str2));
                        u5o2.setOnLongClickListener(new C18890WBh(this, u5o2, str2));
                        igRadioGroup.addView(u5o2);
                        if (promoteAudience.A0D) {
                            if (182.A06(0Tu.A05, this.A07, 36326867749320745L)) {
                                View inflate = LayoutInflater.from(fragmentActivity2).inflate(R.layout.promote_row_with_subtitle_text, igRadioGroup, false);
                                TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.primary_text);
                                TextView A0R2 = AnonymousClass7TG.A0R(inflate, R.id.secondary_text);
                                DbT.A18(fragmentActivity2, A0R, 2131970811);
                                String A0d = AnonymousClass7TF.A0d(fragmentActivity2.getResources(), 2131964884);
                                String A0e = AnonymousClass7TF.A0e(fragmentActivity2.getResources(), A0d, 2131970810);
                                0qQ.A07(A0e);
                                AnonymousClass7AV.A07(new C16300UsR(this, DbV.A02(fragmentActivity2)), A0R2, A0d, A0e);
                                inflate.setVisibility(8);
                                this.A09.put(promoteAudience.A05, inflate);
                                View inflate2 = LayoutInflater.from(fragmentActivity2).inflate(R.layout.promote_toggle_row, igRadioGroup, false);
                                DbT.A18(fragmentActivity2, DbU.A0G(inflate2, R.id.toggle_row_title), 2131970813);
                                DbT.A18(fragmentActivity2, DbU.A0G(inflate2, R.id.toggle_row_subtitle), 2131970812);
                                int A082 = C51972G9s.A08(fragmentActivity2);
                                View A0G = AnonymousClass7TF.A0G(inflate2, R.id.promote_toggle_row_container);
                                0nA.A0Z(A0G, A082);
                                0nA.A0b(A0G, A082);
                                inflate2.setVisibility(8);
                                this.A0A.put(promoteAudience.A05, inflate2);
                                igRadioGroup.addView(inflate);
                                igRadioGroup.addView(inflate2);
                            }
                        }
                        if (AnonymousClass7TE.A1b(promoteAudience.A0B) && ((AudienceValidationResponse) promoteAudience.A0B.get(0)).A02 != null && ((AudienceValidationResponse) promoteAudience.A0B.get(0)).A01 == BoostedComponentMessageType.ERROR && C18175Vmp.A01(promoteAudience) && (A032 = W3x.A03(promoteAudience)) != null) {
                            View inflate3 = LayoutInflater.from(fragmentActivity2).inflate(R.layout.promote_disclaimer_row, igRadioGroup, false);
                            TextView A0R3 = AnonymousClass7TG.A0R(inflate3, R.id.promote_disclaimer_description_title);
                            TextView A0R4 = AnonymousClass7TG.A0R(inflate3, R.id.promote_disclaimer_description);
                            TextView A0R5 = AnonymousClass7TG.A0R(inflate3, R.id.promote_disclaimer_cta);
                            String str4 = A032.A03;
                            String A0H = W3x.A0H(A032);
                            String A0G2 = W3x.A0G(A032);
                            if (str4 != null) {
                                A0R3.setText(str4);
                            }
                            if (!(A0H == null || A0G2 == null)) {
                                String str5 = A032.A02;
                                A0R4.setText(str5);
                                A0R5.setText(A0G2);
                                if (C18175Vmp.A01(promoteData.A07()) && (list = A032.A05) != null) {
                                    for (AudienceMessageEntityRange audienceMessageEntityRange : list) {
                                        Integer BXp2 = audienceMessageEntityRange.BXp();
                                        Integer BMP = audienceMessageEntityRange.BMP();
                                        String url = audienceMessageEntityRange.getUrl();
                                        if (!(BXp2 == null || BMP == null || url == null || (BXp = audienceMessageEntityRange.BXp()) == null)) {
                                            2HY r14 = new 2HY(BXp.intValue(), (BXp2.intValue() + BMP.intValue()) - 1);
                                            0qQ.A0B(str5, 0);
                                            if (r14.isEmpty()) {
                                                substring = "";
                                            } else {
                                                substring = str5.substring(r14.A00, r14.A01 + 1);
                                                0qQ.A07(substring);
                                            }
                                            AnonymousClass7AV.A07(new UsP(audienceMessageEntityRange, this, AnonymousClass7TF.A03(fragmentActivity2, R.attr.igds_color_secondary_selectable_text)), A0R4, substring, str5);
                                        }
                                    }
                                }
                                AnonymousClass7AV.A07(new UsQ(this, A0H, DbV.A02(fragmentActivity2)), A0R5, A0G2, A0G2);
                                inflate3.setVisibility(8);
                                this.A0B.put(promoteAudience.A05, inflate3);
                                igRadioGroup.addView(inflate3);
                            }
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw new IllegalStateException("Audience Id can not be null to create custom audience button row");
                }
            }
        }
        igRadioGroup.A02 = new C19752Wet(this, 1);
        if (!this.A06.A02 || igRadioGroup.findViewWithTag(promoteData.A1Z) == null) {
            i = -1;
        } else {
            View findViewWithTag = igRadioGroup.findViewWithTag(promoteData.A1Z);
            0qQ.A07(findViewWithTag);
            i = findViewWithTag.getId();
        }
        igRadioGroup.A02(i);
        if (igRadioGroup.A00 == -1 && u5o != null) {
            igRadioGroup.A02(u5o.getId());
        }
    }
}
