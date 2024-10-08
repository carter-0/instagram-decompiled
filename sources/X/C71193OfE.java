package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import com.instagram.user.model.User;
import org.webrtc.CameraCapturer;

/* renamed from: X.OfE  reason: case insensitive filesystem */
public final class C71193OfE implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C71193OfE(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
        this.A05 = str;
        this.A04 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String A0b;
        int i2;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                String[] strArr = (String[]) this.A01;
                int i3 = i;
                if (0qQ.A0K(strArr[i], this.A04)) {
                    ((C70968OTp) this.A03).A07.CyM((User) this.A02);
                    return;
                } else if (0qQ.A0K(strArr[i], this.A05)) {
                    User user = (User) this.A02;
                    if (user != null) {
                        ((C70968OTp) this.A03).A07.De4(user.getId());
                        return;
                    }
                    return;
                } else {
                    0wb.A03("DirectPermissionsButtonsThreadViewController", 002.A0c("the dialog option index ", " is not supported", i3));
                    return;
                }
            case 1:
                String str3 = this.A04;
                String moduleName = ((AnonymousClass0iw) this.A01).getModuleName();
                String str4 = this.A05;
                Bundle bundle = new Bundle();
                bundle.putString("merchant_username", str3);
                bundle.putString("prior_module_name", moduleName);
                bundle.putString(AnonymousClass000.A00(741), "checkout_awareness_dialog_learn_more");
                bundle.putString(AnonymousClass000.A00(55), str4);
                DbU.A0w((FragmentActivity) this.A02, bundle, (UserSession) this.A03, ModalActivity.class, "checkout_awareness");
                return;
            default:
                C239413Gj r13 = (C239413Gj) this.A03;
                Context context = (Context) this.A02;
                Reel reel = (Reel) this.A01;
                String str5 = this.A05;
                String str6 = this.A04;
                FragmentActivity A002 = C239403Gi.A00();
                C270194gL r8 = reel.A0H;
                if (!(r8 == null || A002 == null)) {
                    View rootView = C66581MXm.A0A(A002).getRootView();
                    0nA.A0N(rootView);
                    Window window = A002.getWindow();
                    0qQ.A07(window);
                    0qQ.A0A(rootView);
                    boolean A0B = 2db.A0B(rootView, window);
                    Window window2 = A002.getWindow();
                    0qQ.A07(window2);
                    2db.A07(rootView, window2, false);
                    Context context2 = rootView.getContext();
                    C71018OYt oYt = new C71018OYt(context2);
                    User A032 = r8.A03();
                    AnonymousClass3NV r1 = r8.A0A;
                    if (r1 == null) {
                        r1 = AnonymousClass3NV.A08;
                    }
                    String str7 = null;
                    if (r1 == AnonymousClass3NV.A07) {
                        A0b = DbY.A0b(context, A032, 2131965249);
                        str7 = DbY.A0b(context, A032, 2131965248);
                        i2 = 2131965247;
                    } else {
                        A0b = DbY.A0b(context, A032, 2131965250);
                        i2 = 2131965244;
                    }
                    String string = context.getString(i2);
                    if (A0b == null) {
                        str2 = "invitationTitle";
                    } else {
                        JTQ.A0A(oYt.A08).setText(A0b);
                        if (str7 == null || DbV.A12(str7).length() == 0) {
                            C51969G9p.A1M(AnonymousClass7TE.A14(oYt.A07));
                        } else {
                            AnonymousClass0eM r0 = oYt.A07;
                            JTS.A1W(r0, 0);
                            JTQ.A0A(r0).setText(str7);
                        }
                        AnonymousClass7TH.A06(oYt.A0B).requestLayout();
                        String A042 = C253673rC.A04(AnonymousClass7TF.A0A(context), Integer.valueOf(r8.A00()), CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false);
                        if (r8.A00() == 1) {
                            str = " viewer";
                        } else {
                            str = " viewers";
                        }
                        String A0R = 002.A0R(A042, str);
                        0qQ.A0B(A0R, 0);
                        JTQ.A0A(oYt.A09).setText(A0R);
                        if (string == null) {
                            str2 = "invitationButton";
                        } else {
                            AnonymousClass0eM r3 = oYt.A06;
                            JTQ.A0A(r3).setText(string);
                            AnonymousClass0iw r12 = C239413Gj.A08;
                            View view = rootView;
                            C71471OlF olF = new C71471OlF(view, A002, reel, oYt, r13, str5, str6, A0B);
                            0qQ.A0B(r12, 2);
                            oYt.A00 = false;
                            DbU.A1S(r12, (IgImageView) AnonymousClass7TE.A14(oYt.A03), A032);
                            C71406Ok5.A00(AnonymousClass7TH.A06(r3), 11, oYt);
                            C71406Ok5.A00(AnonymousClass7TH.A06(oYt.A05), 12, oYt);
                            PopupWindow popupWindow = oYt.A01;
                            popupWindow.setOnDismissListener(olF);
                            popupWindow.setOutsideTouchable(true);
                            popupWindow.setSoftInputMode(16);
                            popupWindow.setTouchInterceptor(C71438Okd.A00);
                            popupWindow.setAnimationStyle(R.style.PopupAnimationStyle);
                            popupWindow.showAtLocation(rootView, 80, 0, 0);
                            C340307l3 A003 = C340217kt.A00(context2, r13.A01, "live_with_join_flow");
                            ScalingTextureView scalingTextureView = oYt.A02;
                            scalingTextureView.setVisibility(0);
                            if (!scalingTextureView.isAvailable() || scalingTextureView.getSurfaceTexture() == null) {
                                scalingTextureView.A02(new C71281OhM(A003, oYt));
                            } else {
                                C71018OYt.A01(A003, oYt, scalingTextureView.getWidth(), scalingTextureView.getHeight());
                            }
                        }
                    }
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
                C313626gk r02 = r13.A02;
                if (r02 != null) {
                    r02.Cfr();
                    return;
                }
                return;
        }
    }
}
