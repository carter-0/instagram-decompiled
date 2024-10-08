package X;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.api.schemas.TextPostAppBottomSheetCTAType;
import com.instagram.barcelonaig.getapp.GetAppFragment$Companion;
import com.instagram.barcelonaig.intf.GetApp$Type;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.user.model.User;
import java.util.ArrayDeque;

public final class E24 extends AnonymousClass4DH {
    public static final GetAppFragment$Companion A0A = new Object();
    public static final String __redex_internal_original_name = "GetAppFragment";
    public G5P A00;
    public 1Av A01;
    public User A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public GetApp$Type A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public static final void A00(Spanned spanned, View view, E24 e24) {
        CharSequence charSequence;
        String str;
        CharSequence charSequence2 = spanned;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.get_app_description);
        GetApp$Type getApp$Type = e24.A08;
        if (getApp$Type == null) {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        } else {
            int ordinal = getApp$Type.ordinal();
            if (ordinal == 2) {
                charSequence2 = e24.getString(2131953633);
            } else if (ordinal == 1) {
                User user = e24.A02;
                str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                if (user != null) {
                    SpannableStringBuilder A0C = DbS.A0C(user.getUsername());
                    A0C.setSpan(new StyleSpan(1), 0, A0C.length(), 17);
                    User user2 = e24.A02;
                    if (user2 != null) {
                        if (user2.isVerified()) {
                            C244273av.A08(e24.requireContext(), A0C, true);
                        }
                        if (!182.A06(0Tu.A05, AnonymousClass7TF.A0L(e24.A09, 0), 36318887704271471L) || !e24.A06) {
                            A0C.append(" ");
                            String str2 = e24.A03;
                            if (str2 == null) {
                                str = "appName";
                            } else {
                                A0C.append(DbV.A0z(e24, str2, 2131953632));
                                charSequence2 = A0C;
                            }
                        } else {
                            e24.requireContext().getResources();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            ArrayDeque arrayDeque = new ArrayDeque();
                            spannableStringBuilder.append(DbV.A0z(e24, A0C, 2131953631));
                            GNT.A00(spannableStringBuilder, A0C, "[[user_name]]", arrayDeque, new Object[0], 17);
                            charSequence = new SpannableString(spannableStringBuilder);
                            A0R.setText(charSequence);
                            return;
                        }
                    }
                }
            } else if (ordinal != 0) {
                throw AnonymousClass7TE.A1K();
            } else if (spanned == null) {
                return;
            }
            charSequence = charSequence2;
            A0R.setText(charSequence);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(4522);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, androidx.fragment.app.Fragment, X.E24, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ae, code lost:
        if (r11.A06 == false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r4 = 0
            r6 = r12
            X.0qQ.A0B(r12, r4)
            r7 = r11
            super.onViewCreated(r12, r13)
            android.os.Bundle r2 = r11.requireArguments()
            java.lang.Class<com.instagram.user.model.User> r1 = com.instagram.user.model.User.class
            java.lang.String r0 = "get_app_user"
            android.os.Parcelable r0 = X.C320236s2.A00(r2, r1, r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r11.A02 = r0
            android.os.Bundle r1 = r11.requireArguments()
            java.lang.String r0 = "get_app_entrypoint"
            java.lang.String r0 = r1.getString(r0)
            r11.A04 = r0
            android.os.Bundle r1 = r11.requireArguments()
            java.lang.String r0 = "injected_actor_ids"
            java.lang.String r0 = r1.getString(r0)
            r11.A05 = r0
            com.instagram.user.model.User r1 = r11.A02
            r9 = 0
            if (r1 != 0) goto L_0x0040
            java.lang.String r0 = "user"
        L_0x0038:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0040:
            java.lang.String r0 = r11.A04
            if (r0 == 0) goto L_0x0065
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0065
            com.instagram.barcelonaig.intf.GetApp$Type r0 = com.instagram.barcelonaig.intf.GetApp$Type.NOTIFICATION
        L_0x004c:
            r11.A08 = r0
            X.0eM r2 = r11.A09
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = X.C319886rO.A00(r0)
            r11.A03 = r0
            X.1Av r0 = X.DbX.A0h(r2)
            r11.A01 = r0
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "userPrefs"
            goto L_0x0038
        L_0x0065:
            X.0eM r0 = r11.A09
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.2R8.A04(r0, r1)
            if (r0 == 0) goto L_0x0074
            com.instagram.barcelonaig.intf.GetApp$Type r0 = com.instagram.barcelonaig.intf.GetApp$Type.SELF_PROFILE
            goto L_0x004c
        L_0x0074:
            com.instagram.barcelonaig.intf.GetApp$Type r0 = com.instagram.barcelonaig.intf.GetApp$Type.OTHER_PROFILE
            goto L_0x004c
        L_0x0077:
            X.0xa r1 = r0.A01
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r1.getBoolean(r0, r4)
            r11.A07 = r0
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = X.DbX.A0l(r0, r2)
            boolean r0 = r0.A1r()
            r11.A06 = r0
            r0 = 2131433537(0x7f0b1841, float:1.8488862E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r12, r0)
            X.0lg r3 = X.AnonymousClass7TF.A0L(r2, r4)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318887704271471(0x8107d600401a6f, double:3.031549056379114E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r11.A06
            r2 = 2131953636(0x7f1307e4, float:1.9543749E38)
            if (r0 != 0) goto L_0x00b3
        L_0x00b0:
            r2 = 2131953637(0x7f1307e5, float:1.954375E38)
        L_0x00b3:
            r1 = 1
            java.lang.String r0 = r11.A03
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = "appName"
            goto L_0x0038
        L_0x00bc:
            android.text.SpannableStringBuilder r3 = X.DbY.A0E(r11, r0, r2)
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r1)
            int r1 = r3.length()
            r0 = 17
            r3.setSpan(r2, r4, r1, r0)
            r5.setText(r3)
            com.instagram.barcelonaig.intf.GetApp$Type r1 = r11.A08
            if (r1 != 0) goto L_0x00d9
            java.lang.String r0 = "type"
            goto L_0x0038
        L_0x00d9:
            com.instagram.barcelonaig.intf.GetApp$Type r0 = com.instagram.barcelonaig.intf.GetApp$Type.NOTIFICATION
            if (r1 != r0) goto L_0x00f6
            r0 = 2131435629(0x7f0b206d, float:1.8493106E38)
            android.view.View r8 = r12.requireViewById(r0)
            r8.setVisibility(r4)
            X.0xx r0 = X.DbW.A0E(r11)
            r10 = 9
            X.JTw r5 = new X.JTw
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
            X.AnonymousClass7TE.A1Z(r5, r0)
            return
        L_0x00f6:
            A00(r9, r12, r11)
            A01(r12, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E24.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public static final void A01(View view, TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType, E24 e24) {
        String A0z;
        View.OnClickListener fp6;
        String str;
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(view, R.id.get_app_cta);
        GetApp$Type getApp$Type = e24.A08;
        if (getApp$Type == null) {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        } else {
            int ordinal = getApp$Type.ordinal();
            if (ordinal == 2 || ordinal == 1) {
                AnonymousClass0eM r6 = e24.A09;
                0lg A0X = DbT.A0X(r6);
                0qQ.A0B(A0X, 0);
                if (AnonymousClass9HN.A00(A0X).booleanValue()) {
                    0Tu r4 = 0Tu.A05;
                    long A012 = 182.A01(r4, A0X, 36600362677112683L) * 1000;
                    if (A012 > 0 && A012 > System.currentTimeMillis()) {
                        UserSession A0S = DbW.A0S(r6, 0);
                        if (AnonymousClass9HN.A00(A0S).booleanValue() && C319886rO.A01(A0S) && 182.A06(r4, A0S, 36318887700994623L)) {
                            int i = 2131953630;
                            if (e24.A07) {
                                i = 2131953629;
                            }
                            A0z = e24.getString(i);
                            fp6 = new FPE(5, (Object) igdsBottomButtonLayout, (Object) e24);
                            igdsBottomButtonLayout.setPrimaryAction(A0z, fp6);
                            return;
                        }
                    }
                }
                String str2 = e24.A03;
                if (str2 == null) {
                    str = "appName";
                } else {
                    A0z = DbV.A0z(e24, str2, 2131953627);
                    fp6 = new FP6((Object) e24, 42);
                    igdsBottomButtonLayout.setPrimaryAction(A0z, fp6);
                    return;
                }
            } else if (ordinal != 0) {
                throw AnonymousClass7TE.A1K();
            } else if (textPostAppBottomSheetCTAType != null) {
                A02(textPostAppBottomSheetCTAType, e24, igdsBottomButtonLayout);
                return;
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType, E24 e24, IgdsBottomButtonLayout igdsBottomButtonLayout) {
        String str;
        View.OnClickListener onClickListener;
        int i;
        int ordinal = textPostAppBottomSheetCTAType.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                str = e24.getString(2131953630);
                i = 5;
            } else if (ordinal == 3) {
                str = e24.getString(2131953629);
                i = 6;
            } else if (ordinal != 0) {
                throw AnonymousClass7TE.A1K();
            } else {
                return;
            }
            onClickListener = new FPH(i, (Object) igdsBottomButtonLayout, (Object) e24, (Object) textPostAppBottomSheetCTAType);
        } else {
            int i2 = 2131953627;
            if (0oI.A0A(e24.requireContext())) {
                i2 = 2131953628;
            }
            String str2 = e24.A03;
            if (str2 == null) {
                0qQ.A0F("appName");
                throw AnonymousClass00P.createAndThrow();
            } else {
                str = DbV.A0z(e24, str2, i2);
                onClickListener = new FP6((Object) e24, 43);
            }
        }
        igdsBottomButtonLayout.setPrimaryAction(str, onClickListener);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(804598473);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_getapp, false);
        AnonymousClass0fD.A09(1043314853, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(997935029);
        super.onDestroy();
        this.A04 = null;
        this.A05 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(924257256, A022);
    }
}
