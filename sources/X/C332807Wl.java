package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

/* renamed from: X.7Wl  reason: invalid class name and case insensitive filesystem */
public final class C332807Wl implements AnonymousClass7SN, C332767Wh, AnonymousClass7TJ, C332817Wm, C332827Wn, AnonymousClass7VW, C332837Wo, C332847Wp, C332857Wq, C332867Wr, AnonymousClass7Ws, AnonymousClass7Wt, C332877Wu, C332887Wv, C332897Ww, C332907Wx, C332917Wy, C332927Wz, AnonymousClass7X0, AnonymousClass7X1, AnonymousClass7X2, AnonymousClass7TK, AnonymousClass7X3, AnonymousClass7X4, AnonymousClass7X5, AnonymousClass7X6, AnonymousClass7X7, AnonymousClass7X8, AnonymousClass7X9, AnonymousClass7VM, AnonymousClass7XA, AnonymousClass7XB, AnonymousClass7XC, AnonymousClass7XD, AnonymousClass7XE, AnonymousClass7XH, AnonymousClass7XI, AnonymousClass7UB, AnonymousClass7XJ, AnonymousClass7XK, AnonymousClass7XL, AnonymousClass7XM, AnonymousClass7XN, AnonymousClass7XO, AnonymousClass7XP, AnonymousClass7XQ, AnonymousClass7XR, AnonymousClass7XS, AnonymousClass7XT, AnonymousClass7XU, AnonymousClass7XV, AnonymousClass7XW, AnonymousClass7XX, AnonymousClass7XY, AnonymousClass7XZ, AnonymousClass7VB, AnonymousClass7TQ, 0lm, C332937Xa, C332947Xb, C332957Xc, C332967Xd, AnonymousClass7VY, AnonymousClass7VZ, C332977Xe, C332987Xf, C332997Xg, C333007Xh, C333017Xi, C333027Xj, C333037Xk, C333047Xl, C333057Xm, C333067Xn, AnonymousClass7TL, C333077Xo, C333087Xp, C333097Xq, C333117Xs, C333127Xt, C333137Xu, C333147Xv, C333157Xw, C333167Xx, C333177Xy, C333187Xz, AnonymousClass7Y0, AnonymousClass7Y1, AnonymousClass7Y2, AnonymousClass7Y3, AnonymousClass7Y4, AnonymousClass7Y5, AnonymousClass7Y6, AnonymousClass7Y7, AnonymousClass7Y8, AnonymousClass7Y9, AnonymousClass7YA, AnonymousClass7YB, AnonymousClass7YC, AnonymousClass7YD, AnonymousClass7YE, AnonymousClass7YF, AnonymousClass7YG, AnonymousClass7YH, AnonymousClass7YI, AnonymousClass7YJ, AnonymousClass7YK, AnonymousClass7YL, C332307Ul, AnonymousClass7VO, AnonymousClass7YM, AnonymousClass7YN, C332487Vf, AnonymousClass7YO, AnonymousClass7YP, AnonymousClass7YQ, AnonymousClass7SF {
    public final AnonymousClass0eM A00;

    public final void AFb(String str, String str2, String str3, String str4, boolean z) {
        0qQ.A0B(str2, 1);
        ((C332767Wh) A00().A0Z.getValue()).AFb(str, str2, str3, str4, z);
    }

    public final boolean AFj(DirectMessageIdentifier directMessageIdentifier) {
        0qQ.A0B(directMessageIdentifier, 0);
        return ((C332867Wr) A00().A0G.getValue()).AFj(directMessageIdentifier);
    }

    public final void AIF(C66709MbG mbG) {
        0qQ.A0B(mbG, 0);
        ((AnonymousClass7XQ) A00().A0D.getValue()).AIF(mbG);
    }

    public final void AN2(MessageIdentifier messageIdentifier) {
        0qQ.A0B(messageIdentifier, 0);
        ((C333167Xx) A00().A07.getValue()).AN2(messageIdentifier);
    }

    public final void ASj(boolean z) {
        ((C333187Xz) A00().A0C.getValue()).ASj(true);
    }

    public final void ATV(boolean z) {
        ((C332897Ww) A00().A09.getValue()).ATV(true);
    }

    public final void ATf(C66709MbG mbG, boolean z) {
        0qQ.A0B(mbG, 0);
        ((AnonymousClass7XQ) A00().A0D.getValue()).ATf(mbG, z);
    }

    public final void AUn(C328007Db r4, String str, boolean z) {
        0qQ.A0B(str, 0);
        ((C332887Wv) A00().A1R.getValue()).AUn((C328007Db) null, str, true);
    }

    public final void AWQ(2FW r2, DirectMessageIdentifier directMessageIdentifier, int i, boolean z) {
        0qQ.A0B(r2, 1);
        ((AnonymousClass7XC) A00().A0F.getValue()).AWQ(r2, directMessageIdentifier, i, z);
    }

    public final boolean CHm(DirectMessageIdentifier directMessageIdentifier, C62320sa r3) {
        0qQ.A0B(directMessageIdentifier, 0);
        return ((C332867Wr) A00().A0G.getValue()).CHm(directMessageIdentifier, r3);
    }

    public final boolean CHn(DirectMessageIdentifier directMessageIdentifier) {
        0qQ.A0B(directMessageIdentifier, 0);
        return ((C332867Wr) A00().A0G.getValue()).CHn(directMessageIdentifier);
    }

    public final void CIw(String str, String str2, String str3, String str4, String str5, boolean z) {
        0qQ.A0B(str, 0);
        ((AnonymousClass7Y0) A00().A0J.getValue()).CIw(str, str2, str3, str4, str5, z);
    }

    public final void CJJ(String str) {
        0qQ.A0B(str, 0);
        ((AnonymousClass7Y2) A00().A0L.getValue()).CJJ(str);
    }

    public final void CJS(RectF rectF, 2FW r18, DirectMessageIdentifier directMessageIdentifier, GradientSpinner gradientSpinner, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map) {
        String str10 = str;
        0qQ.A0B(str10, 0);
        String str11 = str2;
        0qQ.A0B(str11, 1);
        String str12 = str6;
        0qQ.A0B(str12, 5);
        DirectMessageIdentifier directMessageIdentifier2 = directMessageIdentifier;
        0qQ.A0B(directMessageIdentifier2, 6);
        2FW r2 = r18;
        0qQ.A0B(r2, 9);
        Integer num2 = num;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str7;
        ((AnonymousClass7Ws) A00().A0N.getValue()).CJS(rectF, r2, directMessageIdentifier2, (GradientSpinner) null, num2, str10, str11, str13, str14, str15, str12, str16, str8, str9, map);
    }

    public final void CfT(ImageUrl imageUrl, MessagingUser messagingUser) {
        0qQ.A0B(messagingUser, 0);
        ((AnonymousClass7VW) A00().A12.getValue()).CfT(imageUrl, messagingUser);
    }

    public final C70440O6r Cg8(C74403PuJ puJ, String str) {
        0qQ.A0B(str, 0);
        return ((AnonymousClass7X5) A00().A0U.getValue()).Cg8(puJ, str);
    }

    public final void Ch6(C254793t3 r9, String str, String str2, String str3, String str4, String str5, List list) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(list, 4);
        ((AnonymousClass7XD) A00().A0W.getValue()).Ch6(r9, str, str2, str3, str4, (String) null, list);
    }

    public final void Ch7(C254793t3 r7, String str, String str2, String str3, int i) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str3, 3);
        ((AnonymousClass7XD) A00().A0W.getValue()).Ch7(r7, str, str2, str3, i);
    }

    public final Spannable CnI(Context context, CharSequence charSequence, String str, int i, boolean z) {
        0qQ.A0B(charSequence, 0);
        return ((AnonymousClass7XM) A00().A1X.getValue()).CnI(context, charSequence, str, i, z);
    }

    public final void CpE(RectF rectF, OMU omu, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(rectF, 1);
        ((C332997Xg) A00().A0a.getValue()).CpE(rectF, omu, str);
    }

    public final void CpH(String str) {
        0qQ.A0B(str, 0);
        ((C333007Xh) A00().A0c.getValue()).CpH(str);
    }

    public final void CpK(String str, String str2) {
        ((AnonymousClass7Wt) A00().A0i.getValue()).CpK(str, (String) null);
    }

    public final void CpQ(String str, String str2, List list) {
        0qQ.A0B(list, 2);
        ((C333017Xi) A00().A0g.getValue()).CpQ(str, str2, list);
    }

    public final void CpS(RectF rectF, ImageUrl imageUrl, OMU omu, MessageIdentifier messageIdentifier, AnonymousClass3OA r20, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, boolean z) {
        RectF rectF2 = rectF;
        0qQ.A0B(rectF2, 6);
        ((AnonymousClass7Wt) A00().A0i.getValue()).CpS(rectF2, imageUrl, omu, messageIdentifier, r20, bool2, false, str, str2, str3, str4, (String) null, z);
    }

    public final void Cpb(DirectMessageIdentifier directMessageIdentifier) {
        0qQ.A0B(directMessageIdentifier, 0);
        ((C333027Xj) A00().A0k.getValue()).Cpb(directMessageIdentifier);
    }

    public final void Cpd(RectF rectF, 28D r9, CameraConfiguration cameraConfiguration, C254933tI r11, String str, boolean z) {
        0qQ.A0B(r9, 1);
        ((C333037Xk) A00().A0m.getValue()).Cpd(rectF, r9, cameraConfiguration, r11, str, z);
    }

    public final void Cpe(RectF rectF, C74455PvA pvA, MessageIdentifier messageIdentifier, List list, List list2, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(messageIdentifier, 0);
        ((AnonymousClass7XE) A00().A0n.getValue()).Cpe(rectF, pvA, messageIdentifier, list, list2, z, z2, z3);
    }

    public final void Cpj(String str) {
        0qQ.A0B(str, 0);
        ((AnonymousClass7X7) A00().A13.getValue()).Cpj(str);
    }

    public final void Cpn(String str) {
        0qQ.A0B(str, 0);
        ((AnonymousClass7XV) A00().A0p.getValue()).Cpn(str);
    }

    public final void Cpp(RectF rectF, String str, String str2) {
        0qQ.A0B(rectF, 2);
        ((C333047Xl) A00().A0r.getValue()).Cpp(rectF, str, str2);
    }

    public final void Cpt(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        ((AnonymousClass7X6) A00().A0t.getValue()).Cpt(str, str2);
    }

    public final void Cpw(View view, AnonymousClass77B r3) {
        0qQ.A0B(view, 0);
        ((AnonymousClass7YB) A00().A0v.getValue()).Cpw(view, r3);
    }

    public final void Cpy(1iA r10, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r10, 1);
        0qQ.A0B(str4, 5);
        0qQ.A0B(str5, 6);
        AnonymousClass7XH r0 = (AnonymousClass7XH) A00().A0w.getValue();
        r0.Cpy(r10, str, str2, str3, str4, str5, i, z);
    }

    public final void Cpz(View view, C68168N3i n3i, Integer num, List list, int i, boolean z, boolean z2) {
        0qQ.A0B(num, 4);
        ((C332917Wy) A00().A0u.getValue()).Cpz(view, n3i, num, list, i, z, z2);
    }

    public final void Cq2(View view, MessagingUser messagingUser) {
        0qQ.A0B(messagingUser, 0);
        0qQ.A0B(view, 1);
        ((AnonymousClass7VW) A00().A12.getValue()).Cq2(view, messagingUser);
    }

    public final void Cq4(RectF rectF, 28D r4, CameraConfiguration cameraConfiguration, String str) {
        0qQ.A0B(r4, 1);
        ((AnonymousClass7YQ) A00().A0x.getValue()).Cq4(rectF, r4, (CameraConfiguration) null, str);
    }

    public final void Cq5(String str) {
        0qQ.A0B(str, 0);
        ((AnonymousClass7XI) A00().A0y.getValue()).Cq5(str);
    }

    public final void Cq6(View view, String str, boolean z) {
        0qQ.A0B(str, 0);
        0qQ.A0B(view, 1);
        ((AnonymousClass7XI) A00().A0y.getValue()).Cq6(view, str, z);
    }

    public final void CqB(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        ((AnonymousClass7X6) A00().A0t.getValue()).CqB(str, str2, str3);
    }

    public final void CqM(MessagingUser messagingUser, String str) {
        0qQ.A0B(messagingUser, 0);
        0qQ.A0B(str, 1);
        ((AnonymousClass7VW) A00().A12.getValue()).CqM(messagingUser, str);
    }

    @Deprecated(message = "")
    public final void CqU(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        ((AnonymousClass7X7) A00().A13.getValue()).CqU(str, str2, str3, z, z2, z3);
    }

    public final void CqV(OMU omu, 1Ns r11, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 0);
        ((AnonymousClass7X7) A00().A13.getValue()).CqV(omu, r11, str, str2, str3, z, z2, z3);
    }

    public final void CqX(RectF rectF, OMU omu, MessageIdentifier messageIdentifier, 1Ns r14, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str, 0);
        String str6 = str2;
        0qQ.A0B(str6, 1);
        0qQ.A0B(r14, 2);
        MessageIdentifier messageIdentifier2 = messageIdentifier;
        0qQ.A0B(messageIdentifier, 7);
        String str7 = str5;
        0qQ.A0B(str7, 8);
        AnonymousClass7X8 r0 = (AnonymousClass7X8) A00().A14.getValue();
        RectF rectF2 = rectF;
        OMU omu2 = omu;
        r0.CqX(rectF2, omu2, messageIdentifier2, r14, str, str6, str3, str4, str7);
    }

    public final void Cql(String str, boolean z, String str2) {
        0qQ.A0B(str, 0);
        ((AnonymousClass7X9) A00().A16.getValue()).Cql(str, z, str2);
    }

    public final void Cqo(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        ((AnonymousClass7VM) A00().A18.getValue()).Cqo(str, str2, str3);
    }

    public final void Cqp(View view, ImageUrl imageUrl, C68168N3i n3i, MessageIdentifier messageIdentifier, GradientSpinner gradientSpinner, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, List list5, Map map, int i, boolean z) {
        String str8 = str;
        0qQ.A0B(str8, 0);
        String str9 = str2;
        0qQ.A0B(str9, 1);
        MessageIdentifier messageIdentifier2 = messageIdentifier;
        0qQ.A0B(messageIdentifier2, 2);
        String str10 = str4;
        String str11 = str3;
        Long l3 = l2;
        Long l4 = l;
        GradientSpinner gradientSpinner2 = gradientSpinner;
        Map map2 = map;
        List list6 = list5;
        List list7 = list4;
        List list8 = list3;
        List list9 = list2;
        C68168N3i n3i2 = n3i;
        List list10 = list;
        ImageUrl imageUrl2 = imageUrl;
        String str12 = str7;
        View view2 = view;
        ((C332847Wp) A00().A19.getValue()).Cqp(view2, imageUrl2, n3i2, messageIdentifier2, gradientSpinner2, l4, l3, str8, str9, str11, str10, str5, str6, str12, list10, list9, list8, list7, list6, map2, i, z);
    }

    public final void De1(RectF rectF, 28D r8, CameraConfiguration cameraConfiguration, String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r8, 1);
        C333077Xo r0 = (C333077Xo) A00().A1K.getValue();
        RectF rectF2 = rectF;
        r0.De1(rectF2, r8, (CameraConfiguration) null, str, (String) null);
    }

    public final SpannableString DkY(Context context, MessageIdentifier messageIdentifier, Integer num, int i) {
        0qQ.A0B(context, 0);
        0qQ.A0B(messageIdentifier, 1);
        0qQ.A0B(num, 2);
        return ((AnonymousClass7XO) A00().A1k.getValue()).DkY(context, messageIdentifier, num, i);
    }

    public final void Dry(MessageIdentifier messageIdentifier, Integer num) {
        0qQ.A0B(num, 1);
        ((AnonymousClass7XO) A00().A1k.getValue()).Dry(messageIdentifier, num);
    }

    public final void EJM(MessageIdentifier messageIdentifier) {
        0qQ.A0B(messageIdentifier, 0);
        ((C333087Xp) A00().A1N.getValue()).EJM(messageIdentifier);
    }

    public final void EKr(String str, boolean z) {
        0qQ.A0B(str, 0);
        ((AnonymousClass7YL) A00().A1S.getValue()).EKr(str, z);
    }

    public final void EdN(MessageIdentifier messageIdentifier, boolean z) {
        0qQ.A0B(messageIdentifier, 0);
        ((C333097Xq) A00().A1T.getValue()).EdN(messageIdentifier, z);
    }

    public final void ErZ(MessageIdentifier messageIdentifier, Integer num) {
        0qQ.A0B(messageIdentifier, 0);
        0qQ.A0B(num, 1);
        ((AnonymousClass7XK) A00().A1U.getValue()).ErZ(messageIdentifier, num);
    }

    public final void Erd(AnonymousClass9JG r2, MessageIdentifier messageIdentifier, Integer num) {
        0qQ.A0B(num, 2);
        ((AnonymousClass7XK) A00().A1U.getValue()).Erd(r2, messageIdentifier, num);
    }

    public final void Etu(2FW r8, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
        0qQ.A0B(r8, 2);
        ((C332947Xb) A00().A0E.getValue()).Etu(r8, messageIdentifier, str, j, z);
    }

    public final void EuG(MessageIdentifier messageIdentifier, C273414mX r10, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(messageIdentifier, 0);
        ((AnonymousClass7XS) A00().A05.getValue()).EuG(messageIdentifier, r10, str, str2, str3, str4, str5);
    }

    public final void EuX(MessageIdentifier messageIdentifier) {
        0qQ.A0B(messageIdentifier, 0);
        ((C332927Wz) A00().A1a.getValue()).EuX(messageIdentifier);
    }

    public final void Eum(PointF pointF, AnonymousClass7FU r10, AnonymousClass7FR r11, long j, boolean z, boolean z2) {
        0qQ.A0B(r11, 2);
        ((AnonymousClass7XX) A00().A1b.getValue()).Eum(pointF, r10, r11, j, z, z2);
    }

    public final void Eup(Integer num, String str, String str2, String str3) {
        0qQ.A0B(num, 0);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        ((AnonymousClass7VO) A00().A1d.getValue()).Eup(num, str, str2, str3);
    }

    public final void FJD(View view, AnonymousClass7FU r9, MessageIdentifier messageIdentifier, C62320sa r11, long j) {
        0qQ.A0B(messageIdentifier, 0);
        ((AnonymousClass7X2) A00().A1m.getValue()).FJD(view, r9, messageIdentifier, (C62320sa) null, j);
    }

    public final void FKn(String str, String str2) {
        0qQ.A0B(str2, 1);
        ((C332487Vf) A00().A1o.getValue()).FKn(str, str2);
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    private final C328877Gp A00() {
        return (C328877Gp) this.A00.getValue();
    }

    public final boolean Cnf(String str, String str2, String str3, String str4) {
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 2);
        return ((AnonymousClass7YM) A00().A1g.getValue()).Cnf(str, str2, str3, "tap");
    }

    public final void CpN(C254793t3 r3, String str, int i) {
        ((C332907Wx) A00().A15.getValue()).CpN(r3, C273654mx.A00(998), i);
    }

    public final void CpO(Activity activity, User user, String str, boolean z) {
        0qQ.A0B(activity, 0);
        ((AnonymousClass7YC) A00().A0f.getValue()).CpO(activity, user, "creator_dm", false);
    }

    public final void Cpo(String str) {
        ((AnonymousClass7Y9) A00().A0q.getValue()).Cpo(C66579MXk.A00(219));
    }

    public final void EK6(MessageIdentifier messageIdentifier, String str) {
        ((AnonymousClass7YJ) A00().A1P.getValue()).EK6(messageIdentifier, C66579MXk.A00(960));
    }

    public C332807Wl(AnonymousClass0eM r1) {
        this.A00 = r1;
    }

    public final void AAr(MessageIdentifier messageIdentifier, long j) {
        ((AnonymousClass7X2) A00().A1m.getValue()).AAr(messageIdentifier, j);
    }

    public final boolean AFs() {
        return ((AnonymousClass7Y9) A00().A0q.getValue()).AFs();
    }

    public final void AGh(String str) {
        ((C332817Wm) A00().A0b.getValue()).AGh(str);
    }

    public final void AGk(String str, int i) {
        ((AnonymousClass7X1) A00().A03.getValue()).AGk(str, i);
    }

    public final void AKo(MessageIdentifier messageIdentifier) {
        ((C333157Xw) A00().A06.getValue()).AKo(messageIdentifier);
    }

    public final void AOV() {
        ((C332897Ww) A00().A09.getValue()).AOV();
    }

    public final void ARZ() {
        ((AnonymousClass7YP) A00().A1q.getValue()).ARZ();
    }

    public final void ARf(boolean z) {
        ((AnonymousClass7TK) A00().A0B.getValue()).ARf(z);
    }

    public final void ASg(MessageIdentifier messageIdentifier) {
        ((C332897Ww) A00().A09.getValue()).ASg(messageIdentifier);
    }

    public final void AUo(C328007Db r2, String str, boolean z) {
        ((C332887Wv) A00().A1R.getValue()).AUo(r2, str, z);
    }

    public final C262224Cq ArY() {
        return ((AnonymousClass7X0) A00().A00.getValue()).ArY();
    }

    public final AnonymousClass4kA AxJ() {
        AnonymousClass4kA AxJ = ((C332937Xa) A00().A01.getValue()).AxJ();
        0qQ.A07(AxJ);
        return AxJ;
    }

    public final String B20() {
        return ((AnonymousClass7XJ) A00().A1G.getValue()).B20();
    }

    public final C61072JwA BA5() {
        return ((AnonymousClass7XZ) A00().A1n.getValue()).BA5();
    }

    public final C74405PuL BWl(C376519Ih r2) {
        return ((AnonymousClass7YO) A00().A1p.getValue()).BWl(r2);
    }

    public final AnonymousClass7NT BeR() {
        return ((C332857Wq) A00().A1E.getValue()).BeR();
    }

    public final String C6X() {
        return ((C332877Wu) A00().A1H.getValue()).C6X();
    }

    public final 1Av CCu() {
        1Av CCu = ((AnonymousClass7XR) A00().A02.getValue()).CCu();
        0qQ.A07(CCu);
        return CCu;
    }

    public final void CHu(String str) {
        ((C332817Wm) A00().A0b.getValue()).CHu(str);
    }

    public final void CHv(String str) {
        ((C332817Wm) A00().A0b.getValue()).CHv(str);
    }

    public final void CLU() {
        ((AnonymousClass7SN) A00().A1i.getValue()).CLU();
    }

    public final void CLb(String str) {
        ((AnonymousClass7Y3) A00().A0O.getValue()).CLb(str);
    }

    public final void CNJ(C69465Nm9 nm9, C331537Rj r3, boolean z, boolean z2) {
        ((AnonymousClass7VY) A00().A0P.getValue()).CNJ(nm9, r3, z, z2);
    }

    public final boolean CPk() {
        return ((C333107Xr) A00().A1T.getValue()).CPk();
    }

    public final boolean CRg() {
        return ((AnonymousClass7XB) A00().A1c.getValue()).CRg();
    }

    public final boolean CW1() {
        return ((AnonymousClass7SN) A00().A1i.getValue()).CW1();
    }

    public final boolean CdW() {
        return ((AnonymousClass7X3) A00().A0M.getValue()).CdW();
    }

    public final void CfY(AnonymousClass76V r2) {
        ((AnonymousClass7YK) A00().A1Q.getValue()).CfY(r2);
    }

    public final void Cfc(String str) {
        ((C332817Wm) A00().A0b.getValue()).Cfc(str);
    }

    public final SpannableString Cfz(String str) {
        return ((C332977Xe) A00().A0S.getValue()).Cfz(str);
    }

    public final C70762OKi CgK(C74328Pt4 pt4, String str) {
        return ((C332827Wn) A00().A0V.getValue()).CgK(pt4, str);
    }

    public final void CjC(CharSequence charSequence, boolean z) {
        ((AnonymousClass7TJ) A00().A0X.getValue()).CjC(charSequence, z);
    }

    public final void CjH(0sP r2) {
        ((C332987Xf) A00().A0Y.getValue()).CjH(r2);
    }

    public final void Cm9(DirectMessageIdentifier directMessageIdentifier) {
        ((AnonymousClass7VB) A00().A1r.getValue()).Cm9(directMessageIdentifier);
    }

    public final void CmA(DirectMessageIdentifier directMessageIdentifier) {
        ((AnonymousClass7VB) A00().A1r.getValue()).CmA(directMessageIdentifier);
    }

    public final boolean CnR() {
        return ((AnonymousClass7XL) A00().A1W.getValue()).CnR();
    }

    public final void CpF(String str) {
        ((C332817Wm) A00().A0b.getValue()).CpF(str);
    }

    public final void CpI() {
        ((AnonymousClass7Y5) A00().A0d.getValue()).CpI();
    }

    public final void CpM(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3) {
        ((AnonymousClass7XT) A00().A0e.getValue()).CpM(str, str2, str3, str4, str5, str6, str7, list, list2, list3);
    }

    public final void CpR(String str, String str2, String str3, String str4, boolean z) {
        ((AnonymousClass7Y6) A00().A0h.getValue()).CpR(str, str2, str3, str4, z);
    }

    public final void CpY(String str) {
        ((AnonymousClass7XU) A00().A0j.getValue()).CpY(str);
    }

    public final boolean Cpc(String str) {
        return ((AnonymousClass7Y7) A00().A0l.getValue()).Cpc(str);
    }

    public final void Cpg(String str) {
        ((C332817Wm) A00().A0b.getValue()).Cpg(str);
    }

    @Deprecated(message = "")
    public final void Cpk() {
        ((AnonymousClass7XU) A00().A0j.getValue()).Cpk();
    }

    public final void Cpl(ImageUrl imageUrl, C242243Te r18, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C242243Te r2 = r18;
        ImageUrl imageUrl2 = imageUrl;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        boolean z6 = z;
        ((AnonymousClass7Y8) A00().A0o.getValue()).Cpl(imageUrl2, r2, str6, str7, str8, str9, str10, i4, i5, i6, z6, z2, z3, z4, z5);
    }

    public final void Cpm(C254793t3 r2, int i, boolean z) {
        ((C332907Wx) A00().A15.getValue()).Cpm(r2, i, z);
    }

    public final void Cpr(View view, ImageUrl imageUrl, Long l, String str, String str2) {
        ((AnonymousClass7YA) A00().A0s.getValue()).Cpr(view, imageUrl, l, str, str2);
    }

    public final void Cps(OMU omu, String str) {
        ((AnonymousClass7X6) A00().A0t.getValue()).Cps(omu, str);
    }

    public final void Cq7() {
        ((C333057Xm) A00().A0z.getValue()).Cq7();
    }

    public final void CqG() {
        ((AnonymousClass7YD) A00().A10.getValue()).CqG();
    }

    public final void CqK(String str, String str2) {
        ((AnonymousClass7YE) A00().A11.getValue()).CqK(str, str2);
    }

    public final void CqW(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        ((AnonymousClass7X8) A00().A14.getValue()).CqW(reel, gradientSpinnerAvatarView);
    }

    public final void Cqf(AnonymousClass2Ep r2, boolean z) {
        ((C332907Wx) A00().A15.getValue()).Cqf(r2, z);
    }

    public final void Cqg(C254793t3 r2, int i, boolean z) {
        ((C332907Wx) A00().A15.getValue()).Cqg(r2, i, z);
    }

    public final void Cqh(String str) {
        ((C332817Wm) A00().A0b.getValue()).Cqh(str);
    }

    public final void Cqn() {
        ((AnonymousClass7YF) A00().A17.getValue()).Cqn();
    }

    public final void CtO(String str) {
        ((C332957Xc) A00().A0H.getValue()).CtO(str);
    }

    public final void CwE() {
        ((C333147Xv) A00().A04.getValue()).CwE();
    }

    public final void Cy4(AnonymousClass74j r2) {
        ((AnonymousClass7TQ) A00().A1B.getValue()).Cy4(r2);
    }

    public final void Cyd(View view) {
        ((AnonymousClass7XB) A00().A1c.getValue()).Cyd(view);
    }

    public final void D9w() {
        ((C332837Wo) A00().A0A.getValue()).D9w();
    }

    public final void DBq(MessageIdentifier messageIdentifier, boolean z) {
        ((AnonymousClass7XW) A00().A1Z.getValue()).DBq(messageIdentifier, z);
    }

    public final void DI5() {
        ((C332857Wq) A00().A1E.getValue()).DI5();
    }

    public final void DJ4() {
        ((C332837Wo) A00().A0A.getValue()).DJ4();
    }

    public final void DJ5() {
        ((C332837Wo) A00().A0A.getValue()).DJ5();
    }

    public final void DMg(String str, boolean z) {
        ((AnonymousClass7VZ) A00().A0Q.getValue()).DMg(str, z);
    }

    public final void DQa(String str) {
        ((C332967Xd) A00().A0I.getValue()).DQa(str);
    }

    public final void DRU() {
        ((C332897Ww) A00().A09.getValue()).DRU();
    }

    public final void DRe(2FW r10, MessageIdentifier messageIdentifier, String str, String str2, String str3, long j, boolean z) {
        ((AnonymousClass7X4) A00().A0R.getValue()).DRe(r10, messageIdentifier, str, str2, str3, j, z);
    }

    public final void DRi(2FW r12, MessageIdentifier messageIdentifier, String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        ((C332837Wo) A00().A0A.getValue()).DRi(r12, messageIdentifier, str, str2, str3, str4, j, z, z2);
    }

    public final void DRs(2FW r8, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        ((AnonymousClass7XP) A00().A1l.getValue()).DRs(r8, messageIdentifier, str, str2, j);
    }

    public final void DbX(2FW r8, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        ((C332837Wo) A00().A0A.getValue()).DbX(r8, messageIdentifier, str, str2, j);
    }

    public final void Diz(MessageIdentifier messageIdentifier) {
        ((AnonymousClass7Y1) A00().A0K.getValue()).Diz(messageIdentifier);
    }

    public final void Dr3(String str) {
        ((AnonymousClass7Y4) A00().A0T.getValue()).Dr3(str);
    }

    public final void DuT() {
        ((AnonymousClass7TQ) A00().A1B.getValue()).DuT();
    }

    public final void E0y(MessageIdentifier messageIdentifier, long j) {
        ((AnonymousClass7XG) A00().A0n.getValue()).E0y(messageIdentifier, j);
    }

    public final void E1A(C327627Bo r2, AnonymousClass7LQ r3, MessageIdentifier messageIdentifier) {
        ((C333067Xn) A00().A1A.getValue()).E1A(r2, r3, messageIdentifier);
    }

    public final void E27() {
        ((AnonymousClass7UB) A00().A1C.getValue()).E27();
    }

    public final void E28(boolean z) {
        ((AnonymousClass7TL) A00().A1D.getValue()).E28(z);
    }

    public final void EBH(String str, String str2) {
        ((C333137Xu) A00().A1I.getValue()).EBH(str, str2);
    }

    public final void EFg(MessageIdentifier messageIdentifier) {
        ((AnonymousClass7XF) A00().A0n.getValue()).EFg(messageIdentifier);
    }

    public final void EGD(MessageIdentifier messageIdentifier, boolean z) {
        ((AnonymousClass7YG) A00().A1L.getValue()).EGD(messageIdentifier, z);
    }

    public final void EJ8() {
        ((AnonymousClass7UB) A00().A1C.getValue()).EJ8();
    }

    public final void EJK() {
        ((AnonymousClass7YH) A00().A1M.getValue()).EJK();
    }

    public final void EJu(MessageIdentifier messageIdentifier) {
        ((AnonymousClass7YI) A00().A1O.getValue()).EJu(messageIdentifier);
    }

    public final void EKV(String str) {
        ((C332887Wv) A00().A1R.getValue()).EKV(str);
    }

    public final void EKd(String str) {
        ((C332887Wv) A00().A1R.getValue()).EKd(str);
    }

    public final void Erc(MessageIdentifier messageIdentifier) {
        ((AnonymousClass7XC) A00().A0F.getValue()).Erc(messageIdentifier);
    }

    public final void Eu1(C327627Bo r2, String str, boolean z) {
        ((C333117Xs) A00().A1V.getValue()).Eu1(r2, str, z);
    }

    public final void Euf() {
        ((AnonymousClass7SN) A00().A1i.getValue()).Euf();
    }

    public final void Euo(View view, C254703su r8, MessageIdentifier messageIdentifier, long j) {
        ((AnonymousClass7XB) A00().A1c.getValue()).Euo(view, r8, messageIdentifier, j);
    }

    public final void Euq(N2I n2i) {
        ((C333177Xy) A00().A08.getValue()).Euq(n2i);
        throw null;
    }

    public final void Eur(AnonymousClass7FU r2, C69347Njm njm, MessageIdentifier messageIdentifier) {
        ((AnonymousClass7XN) A00().A1e.getValue()).Eur(r2, njm, messageIdentifier);
    }

    public final void Eus(AnonymousClass7LQ r2, C69347Njm njm) {
        ((AnonymousClass7XN) A00().A1e.getValue()).Eus(r2, njm);
    }

    public final void EvF() {
        ((AnonymousClass7XY) A00().A1f.getValue()).EvF();
    }

    public final void Ewv(AnonymousClass7EF r2, MessageIdentifier messageIdentifier, String str) {
        ((C332307Ul) A00().A1Y.getValue()).Ewv(r2, messageIdentifier, str);
    }

    public final void Exi(C70620ODr oDr, 1Xj r3, DirectMessageIdentifier directMessageIdentifier, String str) {
        ((AnonymousClass7X3) A00().A0M.getValue()).Exi(oDr, r3, directMessageIdentifier, str);
    }

    public final void FHM(C331007Pc r2) {
        ((C333127Xt) A00().A1j.getValue()).FHM(r2);
    }

    public final void FHP(MessageIdentifier messageIdentifier, boolean z) {
        ((C332947Xb) A00().A0E.getValue()).FHP(messageIdentifier, z);
    }

    public final void FJF(MessageIdentifier messageIdentifier) {
        ((AnonymousClass7X2) A00().A1m.getValue()).FJF(messageIdentifier);
    }

    public final void FJr(N4D n4d, DirectMessageIdentifier directMessageIdentifier) {
        ((AnonymousClass7X3) A00().A0M.getValue()).FJr(n4d, directMessageIdentifier);
    }

    public final void FLx(String str) {
        ((AnonymousClass7YN) A00().A1h.getValue()).FLx(str);
    }

    public final void FMT(Intent intent) {
        ((AnonymousClass7XZ) A00().A1n.getValue()).FMT(intent);
    }

    public final boolean isResumed() {
        return ((AnonymousClass7XA) A00().A1F.getValue()).isResumed();
    }
}
