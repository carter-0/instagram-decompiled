package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import java.lang.ref.Reference;

public final class FOD implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public FOD(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj4;
        this.A05 = str;
        this.A03 = obj2;
        this.A04 = obj;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        int intValue;
        String str;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                UserSession userSession = (UserSession) this.A01;
                DialogInterface.OnCancelListener onCancelListener = (Fragment) this.A03;
                String str4 = this.A05;
                Dialog dialog = (Dialog) this.A04;
                C50143FRa.A02(onCancelListener, userSession, AnonymousClass05K.A01, str4);
                if (onCancelListener instanceof DialogInterface.OnCancelListener) {
                    onCancelListener.onCancel(dialog);
                }
                C50143FRa.A03(userSession, str4, "connect_existing_page", "connect_existing_page_button");
                dialog.dismiss();
                return;
            case 1:
                A052 = AnonymousClass0fD.A05(-486770329);
                1Xj r10 = (1Xj) this.A03;
                boolean CeS = r10.CeS();
                UserSession userSession2 = (UserSession) this.A04;
                if (CeS) {
                    Activity activity = (Activity) ((Reference) this.A01).get();
                    if (activity == null) {
                        i = -1422123769;
                        break;
                    } else {
                        C393819x3.A00(activity, (Fragment) null, 28D.A1S, userSession2, (ReelsVisualRepliesModel) null, (ClipsCelebrationReshareViewModel) null, r10, (String) null, false);
                    }
                } else {
                    Reference reference = (Reference) this.A01;
                    Number number = (Number) this.A02;
                    String str5 = this.A05;
                    Context context = (Context) reference.get();
                    if (context != null) {
                        int A09 = 0nA.A09(context);
                        Context context2 = (Context) reference.get();
                        if (context2 != null) {
                            int A08 = 0nA.A08(context2);
                            RectF rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                            float f = (float) A08;
                            RectF rectF2 = new RectF(0.0f, 0.0f, (float) A09, f);
                            rectF2.offsetTo(0.0f, f);
                            Activity activity2 = (Activity) reference.get();
                            if (activity2 != null) {
                                if (number == null) {
                                    intValue = 0;
                                } else {
                                    intValue = number.intValue();
                                }
                                FFV.A02(activity2, rectF2, rectF, userSession2, (ClipsCelebrationReshareViewModel) null, r10, str5, (String) null, intValue, false);
                            }
                        }
                    }
                }
                i = -2133293474;
                break;
            case 2:
                A052 = AnonymousClass0fD.A05(1198106611);
                String str6 = this.A05;
                if (str6 != null) {
                    C50403FbB fbB = (C50403FbB) this.A04;
                    LTH lth = (LTH) this.A03;
                    User user = (User) this.A01;
                    AnonymousClass7TN r5 = (AnonymousClass7TN) this.A02;
                    UserSession userSession3 = fbB.A02;
                    Bundle A012 = C46447Df9.A02().A01(userSession3, C46474Dfc.A01(userSession3, str6, "direct_thread_ugc_ai", fbB.A01.getModuleName()));
                    DbU.A0w(fbB.A00, A012, userSession3, ModalActivity.class, "profile");
                    if (user != null) {
                        str = user.A03.AaU();
                    } else {
                        str = null;
                    }
                    1Ln A002 = LTH.A00(lth);
                    if (DbT.A1Y(A002)) {
                        A002.A0l("thread_view_creator_button_clicked");
                        A002.A0j(DbZ.A0d(str));
                        A002.Cgf();
                    }
                    AnonymousClass7TN.A00(r5, new MMK(r5, 0));
                }
                i = 299315828;
                break;
            case 3:
                String str7 = this.A05;
                AnonymousClass0iw r3 = (Fragment) this.A03;
                1pE A013 = 1pE.A01((Activity) this.A04, r3, (UserSession) this.A01, str7);
                A013.A0B = new C291175gg(DbW.A0n((User) this.A02));
                A013.A0q = true;
                A013.A01 = r3;
                A013.A06();
                return;
            case 4:
                A052 = AnonymousClass0fD.A05(-380913669);
                C249713kF r32 = C249713kF.A00;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                UserSession userSession4 = (UserSession) this.A04;
                String str8 = this.A05;
                String moduleName = ((AnonymousClass0iw) this.A02).getModuleName();
                1Xj r1 = (1Xj) this.A03;
                if (r1 != null) {
                    str2 = r1.getId();
                } else {
                    str2 = null;
                }
                r32.A1C(fragmentActivity, userSession4, str8, moduleName, "tags", (String) null, str2, (String) null);
                i = -2091580364;
                break;
            default:
                A052 = AnonymousClass0fD.A05(1220448089);
                C249713kF r33 = C249713kF.A00;
                FragmentActivity fragmentActivity2 = (FragmentActivity) this.A01;
                UserSession userSession5 = (UserSession) this.A04;
                String str9 = this.A05;
                String moduleName2 = ((AnonymousClass0iw) this.A02).getModuleName();
                1Xj r12 = (1Xj) this.A03;
                if (r12 != null) {
                    str3 = r12.getId();
                } else {
                    str3 = null;
                }
                r33.A1C(fragmentActivity2, userSession5, str9, moduleName2, "tags", (String) null, str3, (String) null);
                i = 1013012044;
                break;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
