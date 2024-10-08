package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public final class UYv extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ReelDashboardFBViewerMessageBottomsheetFragment";
    public String A00;
    public String A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final String A08 = "reel_dashboard_fb_viewer_message_bottomsheet";

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r3 = 0
            X.0qQ.A0B(r6, r3)
            super.onViewCreated(r6, r7)
            r0 = 2131436206(0x7f0b22ae, float:1.8494276E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r6, r0)
            android.content.Context r2 = r5.requireContext()
            r1 = 2131971492(0x7f134da4, float:1.9579965E38)
            java.lang.String r0 = r5.A06
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "viewerName"
        L_0x001b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0023:
            X.DbX.A13(r2, r4, r0, r1)
            r0 = 2131436209(0x7f0b22b1, float:1.8494282E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r6, r0)
            java.lang.String r0 = r5.A03
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "bottomsheetTitle"
            goto L_0x001b
        L_0x0034:
            r1.setText(r0)
            java.lang.String r0 = r5.A05
            if (r0 == 0) goto L_0x0069
            r0 = 2131436207(0x7f0b22af, float:1.8494278E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r6, r0)
            java.lang.String r0 = r5.A05
        L_0x0044:
            r1.setText(r0)
            r1.setVisibility(r3)
        L_0x004a:
            r0 = 2131437310(0x7f0b26fe, float:1.8496515E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r6, r0)
            r1 = 35
            X.FOz r0 = new X.FOz
            r0.<init>((java.lang.Object) r5, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = X.DbX.A0b(r6, r0)
            com.instagram.common.typedurl.ImageUrl r0 = r5.A02
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "profilePicUrl"
            goto L_0x001b
        L_0x0069:
            java.lang.String r0 = r5.A04
            if (r0 == 0) goto L_0x004a
            r0 = 2131436207(0x7f0b22af, float:1.8494278E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r6, r0)
            java.lang.String r0 = r5.A04
            goto L_0x0044
        L_0x0077:
            r1.setUrl(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UYv.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final String getModuleName() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-1039443742);
        UYv.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString("args_media_owner_obid");
            if (string != null) {
                this.A00 = string;
                String string2 = bundle2.getString(C273654mx.A00(235));
                if (string2 != null) {
                    this.A01 = string2;
                    String string3 = bundle2.getString("args_media_viewer_namme");
                    if (string3 != null) {
                        this.A06 = string3;
                        Parcelable parcelable = bundle2.getParcelable("args_profile_pic_url");
                        if (parcelable != null) {
                            this.A02 = (ImageUrl) parcelable;
                            String string4 = bundle2.getString("args_bottomsheet_title");
                            if (string4 != null) {
                                this.A03 = string4;
                                this.A04 = bundle2.getString("args_emoji_unicode");
                                this.A05 = bundle2.getString("args_reply_text");
                                AnonymousClass0fD.A09(-1408212204, A022);
                                return;
                            }
                            illegalStateException = new IllegalStateException("Required value was null.");
                            i = 1703684520;
                        } else {
                            illegalStateException = new IllegalStateException("Required value was null.");
                            i = 1506755492;
                        }
                    } else {
                        illegalStateException = new IllegalStateException("Required value was null.");
                        i = -122807039;
                    }
                } else {
                    illegalStateException = new IllegalStateException("Required value was null.");
                    i = -1421111537;
                }
            } else {
                illegalStateException = new IllegalStateException("Required value was null.");
                i = -1021610842;
            }
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -1976512512;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2022427611);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.reel_dashboard_message_fb_viewer_bottomsheet, viewGroup, false);
        AnonymousClass0fD.A09(1292678938, A022);
        return inflate;
    }
}
