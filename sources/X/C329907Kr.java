package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;

/* renamed from: X.7Kr  reason: invalid class name and case insensitive filesystem */
public final class C329907Kr {
    public Integer A00;
    public boolean A01;
    public final Activity A02;
    public final Context A03;
    public final View A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C314466iJ A07;
    public final String A08;

    public static final void A00(UserSession userSession, C329907Kr r35, 2Er r36) {
        Integer num;
        long A012;
        String str;
        String str2;
        ViewStub viewStub;
        Integer num2;
        Number number;
        Number number2;
        Integer num3;
        ViewStub viewStub2;
        C329907Kr r12 = r35;
        Context context = r12.A03;
        FragmentActivity fragmentActivity = r12.A02;
        String A002 = AnonymousClass000.A00(22);
        0qQ.A0C(fragmentActivity, A002);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        View view = r12.A04;
        C314466iJ r22 = r12.A07;
        AnonymousClass0iw r32 = r12.A05;
        0qQ.A0B(fragmentActivity2, 2);
        2Er r23 = r36;
        UserSession userSession2 = userSession;
        if (r23.BHS() == 0 && view.findViewById(R.id.nux_banner) == null) {
            SmartSuggestion Bwx = r23.Bwx();
            if (Bwx != null) {
                num3 = Bwx.A03;
            } else {
                num3 = null;
            }
            if (num3 == AnonymousClass05K.A0u) {
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession2, 36319076678638482L) && AnonymousClass4k9.A00(userSession2).A00.getLong("armadillo_biz_tools_upsell_banner_impression_count", 0) < 182.A01(r2, userSession2, 36600551655411611L) && (System.currentTimeMillis() / 1000) - AnonymousClass4k9.A00(userSession2).A00.getLong("armadillo_biz_tools_upsell_banner_last_impression_timestamp", 0) > 182.A01(r2, userSession2, 36600551655477148L) && (viewStub2 = (ViewStub) view.findViewById(R.id.nux_banner_viewstub)) != null) {
                    View inflate = viewStub2.inflate();
                    ((TextView) inflate.findViewById(R.id.title)).setText(context.getText(2131953170));
                    ((TextView) inflate.findViewById(R.id.message)).setText(context.getText(2131953169));
                    View findViewById = inflate.findViewById(R.id.action_button_container);
                    TextView textView = (TextView) inflate.findViewById(R.id.left_button);
                    textView.setTextAppearance(context, R.style.IgPrimaryButton);
                    textView.setBackgroundResource(R.drawable.primary_button_selector_panavision_soft_update);
                    textView.setTypeface((Typeface) null, 1);
                    textView.setText(context.getText(2131953168));
                    View view2 = view;
                    FragmentActivity fragmentActivity3 = fragmentActivity2;
                    AnonymousClass0iw r27 = r32;
                    UserSession userSession3 = userSession2;
                    C314466iJ r29 = r22;
                    2Er r30 = r23;
                    AnonymousClass0fU.A00(new FOE(view2, fragmentActivity3, r27, userSession3, r29, r30), textView);
                    inflate.findViewById(R.id.right_button).setVisibility(8);
                    AnonymousClass0fU.A00(new FOF(view2, fragmentActivity3, r27, userSession3, r29, r30), inflate.findViewById(R.id.dismiss_button));
                    findViewById.setVisibility(0);
                    0xa r10 = AnonymousClass4k9.A00(userSession2).A00;
                    0xY AR4 = r10.AR4();
                    AR4.E5c("armadillo_biz_tools_upsell_banner_impression_count", r10.getLong("armadillo_biz_tools_upsell_banner_impression_count", 0) + 1);
                    AR4.apply();
                    0xY AR42 = r10.AR4();
                    AR42.E5c("armadillo_biz_tools_upsell_banner_last_impression_timestamp", System.currentTimeMillis() / 1000);
                    AR42.apply();
                    C48803EkR.A00(r32, userSession2, "thread_armadillo_biz_tools_upsell_banner_impression", r23.C6C());
                    r22.DUt();
                    num2 = AnonymousClass05K.A0A;
                    r12.A00 = num2;
                }
            }
        }
        0qQ.A0C(fragmentActivity, A002);
        if (r23.BHS() == 0 && view.findViewById(R.id.nux_banner) == null) {
            SmartSuggestion Bwx2 = r23.Bwx();
            if (Bwx2 != null) {
                num = Bwx2.A03;
            } else {
                num = null;
            }
            if (num == AnonymousClass05K.A0u) {
                0Tu r6 = 0Tu.A05;
                if (182.A06(r6, userSession2, 36316611367408140L)) {
                    int A013 = (int) 182.A01(r6, userSession2, 36598086345034852L);
                    0xY AR43 = AnonymousClass4k9.A00(userSession2).A00.AR4();
                    AR43.E5Z("ctd_upsell_banner_qe_user_group", A013);
                    AR43.apply();
                    AnonymousClass9IV AtZ = r23.AtZ();
                    if (AtZ == null || (number2 = (Number) AtZ.A01) == null) {
                        A012 = 182.A01(r6, userSession2, 36598086344182878L);
                    } else {
                        A012 = (long) number2.intValue();
                    }
                    0xa r15 = AnonymousClass4k9.A00(userSession2).A00;
                    if (A013 == 1) {
                        str = "ctd_upsell_one_banner_impression_count";
                    } else if (A013 != 2) {
                        str = "ctd_upsell_banner_impression_count_v2";
                    } else {
                        str = "ctd_upsell_two_banner_impression_count";
                    }
                    if (r15.getLong(str, 0) < A012) {
                        long A014 = 182.A01(r6, userSession2, 36598086344248415L);
                        AnonymousClass9IV AtZ2 = r23.AtZ();
                        if (!(AtZ2 == null || (number = (Number) AtZ2.A00) == null)) {
                            A014 = SandboxRepository.CACHE_TTL * ((long) number.intValue());
                        }
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        0xa r1 = AnonymousClass4k9.A00(userSession2).A00;
                        if (A013 == 1) {
                            str2 = "ctd_upsell_one_banner_last_impression_timestamp";
                        } else if (A013 != 2) {
                            str2 = "ctd_upsell_banner_last_impression_timestamp_v2";
                        } else {
                            str2 = "ctd_upsell_two_banner_last_impression_timestamp";
                        }
                        if (currentTimeMillis - r1.getLong(str2, 0) > A014 && (viewStub = (ViewStub) view.findViewById(R.id.nux_banner_viewstub)) != null) {
                            View inflate2 = viewStub.inflate();
                            int i = AnonymousClass4k9.A00(userSession2).A00.getInt("ctd_upsell_banner_qe_user_group", 0);
                            if (i == 1) {
                                i = 1;
                                OPL.A00(context, view, fragmentActivity2, r32, userSession2, r22, r23, true);
                            } else {
                                View findViewById2 = view.findViewById(R.id.nux_banner);
                                if (findViewById2 != null) {
                                    ((TextView) findViewById2.findViewById(R.id.title)).setText(context.getText(2131957196));
                                    ((TextView) findViewById2.findViewById(R.id.message)).setText(context.getText(2131957195));
                                    View findViewById3 = findViewById2.findViewById(R.id.action_button_container);
                                    TextView textView2 = (TextView) findViewById2.findViewById(R.id.left_button);
                                    textView2.setText(context.getText(2131957197));
                                    AnonymousClass0fU.A00(new C71369OjS(context, view, fragmentActivity2, r32, userSession2, r22, r23), textView2);
                                    TextView textView3 = (TextView) findViewById2.findViewById(R.id.right_button);
                                    textView3.setText(context.getText(2131957200));
                                    AnonymousClass0fU.A00(new FOU(view, fragmentActivity2, r32, userSession2, r22, r23, i), textView3);
                                    findViewById3.setVisibility(0);
                                }
                                C48805EkT.A00(r32, userSession2, "thread_ctd_upsell_first_banner_impression", r23.C6C());
                            }
                            AnonymousClass0fU.A00(new FOT(view, fragmentActivity2, r32, userSession2, r22, r23, i), inflate2.findViewById(R.id.dismiss_button));
                            AnonymousClass4kA A003 = AnonymousClass4k9.A00(userSession2);
                            long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                            AnonymousClass9JG r9 = (AnonymousClass9JG) AnonymousClass4kA.A0b.get(Integer.valueOf(i));
                            if (r9 != null) {
                                0xa r8 = A003.A00;
                                String str3 = r9.A00;
                                long j = r8.getLong(str3, 0);
                                0xY AR44 = r8.AR4();
                                AR44.E5c(str3, j + 1);
                                AR44.apply();
                                0xY AR45 = r8.AR4();
                                AR45.E5c(r9.A01, currentTimeMillis2);
                                AR45.apply();
                            }
                            r22.DUt();
                            num2 = AnonymousClass05K.A06;
                            r12.A00 = num2;
                        }
                    }
                }
            }
        }
    }

    public C329907Kr(Activity activity, Context context, View view, AnonymousClass0iw r4, UserSession userSession, C314466iJ r6, String str) {
        this.A06 = userSession;
        this.A02 = activity;
        this.A03 = context;
        this.A04 = view;
        this.A07 = r6;
        this.A05 = r4;
        this.A08 = str;
    }
}
