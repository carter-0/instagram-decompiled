package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.JlK  reason: case insensitive filesystem */
public final class C60427JlK extends 2Rw {
    public FYP A00 = new FYP(EWS.A06, "load_more_default_key");
    public C60931Jtp A01;
    public final AnonymousClass0iw A02;
    public final EGK A03 = new EGK((G5G) null);
    public final C61428K7d A04;
    public final boolean A05;
    public final boolean A06;

    public final void A00(C60931Jtp jtp) {
        EWS ews;
        0qQ.A0B(jtp, 0);
        this.A01 = jtp;
        if (jtp.A03) {
            ews = EWS.LOADING;
        } else {
            ews = EWS.A06;
        }
        this.A00 = new FYP(ews, "load_more_default_key");
        notifyDataSetChanged();
    }

    public final void onBindViewHolder(C249703kE r13, int i) {
        String str;
        int A07 = JTP.A07(this, r13, 0, i);
        if (A07 == 1) {
            C60931Jtp jtp = this.A01;
            if (jtp != null) {
                C60662Jp9 jp9 = (C60662Jp9) r13;
                JWF jwf = (JWF) DbZ.A0g(jtp.A01, i);
                AnonymousClass0iw r10 = this.A02;
                C61428K7d k7d = this.A04;
                0qQ.A0B(jwf, 0);
                User user = (User) jwf.A02;
                int i2 = 0;
                if (user != null) {
                    DbU.A1H(jp9.A02, user);
                    jp9.A05.setVisibility(DbW.A01(user.isVerified() ? 1 : 0));
                    LiveUserPaySupportTier liveUserPaySupportTier = (LiveUserPaySupportTier) jwf.A01;
                    if (liveUserPaySupportTier != null) {
                        Context A062 = JTQ.A06(jp9);
                        IgImageView igImageView = jp9.A04;
                        0qQ.A06(igImageView);
                        TextView textView = jp9.A00;
                        0qQ.A06(textView);
                        LKL.A01(A062, igImageView, textView, liveUserPaySupportTier, jwf.A00);
                    }
                    DbU.A1S(r10, jp9.A03, user);
                    LY2.A00(jp9.itemView, 19, k7d, user);
                }
                LFJ lfj = k7d.A02;
                if (lfj != null) {
                    String str2 = "";
                    if (!0qQ.A0K(lfj.A00, "time") || jwf.A03.length() <= 0) {
                        LFJ lfj2 = k7d.A02;
                        if (lfj2 != null) {
                            if (!0qQ.A0K(lfj2.A00, "amount") || jwf.A04 == null) {
                                str = str2;
                            } else {
                                TextView textView2 = jp9.A01;
                                textView2.setVisibility(0);
                                textView2.setText(jwf.A04);
                                str = AnonymousClass7TF.A0e(DbU.A05(jp9.itemView), String.valueOf(jwf.A04), 2131953604);
                            }
                        }
                    } else {
                        TextView textView3 = jp9.A01;
                        textView3.setVisibility(0);
                        Resources resources = jp9.itemView.getResources();
                        0qQ.A07(resources);
                        textView3.setText(1G0.A09(resources, Double.parseDouble(jwf.A03)));
                        str = 1G0.A03(JTQ.A06(jp9), Double.parseDouble(jwf.A03));
                    }
                    if (jwf.A00 > 1) {
                        str2 = JTS.A0i(DbU.A05(jp9.itemView), jwf.A00 - 1, 2131953605);
                    }
                    0qQ.A0A(str2);
                    View findViewById = jp9.itemView.findViewById(R.id.user_pay_supporter_row);
                    Resources A052 = DbU.A05(jp9.itemView);
                    CharSequence text = jp9.A02.getText();
                    LiveUserPaySupportTier liveUserPaySupportTier2 = (LiveUserPaySupportTier) jwf.A01;
                    if (liveUserPaySupportTier2 != null) {
                        i2 = liveUserPaySupportTier2.ordinal();
                    }
                    findViewById.setContentDescription(A052.getString(2131953603, new Object[]{text, Integer.valueOf(i2 + 1), str2, str}));
                    return;
                }
                0qQ.A0F("interactor");
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (A07 == 4) {
            FYP fyp = this.A00;
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            ((C46929Dnj) r13).A00.setState(fyp.A00);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            view = DbV.A0D(viewGroup).inflate(R.layout.iglive_user_pay_supporter_list_empty_state, viewGroup, false);
            if (this.A05) {
                view.setVisibility(0);
            }
            i2 = 7;
        } else if (i == 1) {
            return new C60662Jp9(DbU.A0A(JTP.A0G(viewGroup), viewGroup, R.layout.iglive_user_pay_supporter, false));
        } else {
            if (i == 3) {
                view = DbV.A0D(viewGroup).inflate(R.layout.supporters_list_empty_state_insights_gone, viewGroup, false);
                i2 = 8;
            } else if (i == 4) {
                EGK egk = this.A03;
                LayoutInflater.from(viewGroup.getContext());
                return egk.A00(viewGroup);
            } else {
                throw DbW.A0b(AnonymousClass000.A00(1052), i);
            }
        }
        return new C60681JpS(view, i2);
    }

    public C60427JlK(AnonymousClass0iw r4, C61428K7d k7d, boolean z, boolean z2) {
        this.A02 = r4;
        this.A04 = k7d;
        this.A05 = z;
        this.A06 = z2;
    }

    public final int getItemCount() {
        ArrayList arrayList;
        int A032 = AnonymousClass0fD.A03(-1461787732);
        C60931Jtp jtp = this.A01;
        int i = 1;
        if (!(jtp == null || (arrayList = jtp.A01) == null || !DbT.A1b(arrayList))) {
            C60931Jtp jtp2 = this.A01;
            if (jtp2 != null) {
                i = jtp2.A01.size();
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A0A(-1673048486, A032);
                throw A0y;
            }
        }
        AnonymousClass0fD.A0A(-865892307, A032);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r2 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            r0 = -1659874950(0xffffffff9d10517a, float:-1.9100364E-21)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.Jtp r2 = r4.A01
            r1 = 1
            if (r2 == 0) goto L_0x0018
            boolean r0 = r2.A03
            if (r0 != r1) goto L_0x0018
            r1 = 4
        L_0x0011:
            r0 = 221200730(0xd2f415a, float:5.4004703E-31)
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        L_0x0018:
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x002a
            if (r2 == 0) goto L_0x0011
            java.util.ArrayList r0 = r2.A01
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.isEmpty()
            if (r0 != r1) goto L_0x002c
            r1 = 3
            goto L_0x0011
        L_0x002a:
            if (r2 == 0) goto L_0x0011
        L_0x002c:
            java.util.ArrayList r0 = r2.A01
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.isEmpty()
            if (r0 != r1) goto L_0x0011
            r1 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60427JlK.getItemViewType(int):int");
    }
}
