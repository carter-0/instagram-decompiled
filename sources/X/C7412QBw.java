package X;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;

/* renamed from: X.QBw  reason: case insensitive filesystem */
public final class C7412QBw extends C240393Ks {
    public Q5J A00;
    public String A01;

    public final Dialog A0F(Bundle bundle) {
        return this.A00;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C7412QBw.super.onConfigurationChanged(configuration);
        this.A00.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (r3 == null) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 862053173(0x3361e335, float:5.259354E-8)
            int r5 = X.AnonymousClass0fD.A02(r0)
            X.C7412QBw.super.onCreate(r9)
            android.os.Bundle r1 = r8.requireArguments()
            java.lang.String r0 = "arg_session_id"
            java.lang.String r0 = r1.getString(r0)
            r8.A01 = r0
            X.Q5J r0 = r8.A00
            if (r0 != 0) goto L_0x009f
            androidx.fragment.app.FragmentActivity r7 = r8.requireActivity()
            android.content.Intent r2 = r7.getIntent()
            java.lang.String r1 = "com.facebook.platform.protocol.PROTOCOL_VERSION"
            r0 = 0
            int r1 = r2.getIntExtra(r1, r0)
            java.util.List r0 = X.C11164SCy.A01
            boolean r0 = X.C66581MXm.A1W(r1, r0)
            if (r0 == 0) goto L_0x0078
            r0 = 20140701(0x133529d, float:3.293638E-38)
            if (r1 < r0) goto L_0x0078
            java.lang.String r0 = "com.facebook.platform.protocol.METHOD_ARGS"
            android.os.Bundle r1 = r2.getBundleExtra(r0)
        L_0x003c:
            java.lang.String r0 = "action"
            java.lang.String r6 = r1.getString(r0)
            java.lang.String r0 = "params"
            android.os.Bundle r4 = r1.getBundle(r0)
            boolean r0 = X.C11406SSd.A05(r6)
            if (r0 == 0) goto L_0x0059
            r7.finish()
            r0 = 1653268638(0x628ae09e, float:1.280918E21)
        L_0x0055:
            X.AnonymousClass0fD.A09(r0, r5)
            return
        L_0x0059:
            java.lang.String r1 = r8.A01
            r0 = 0
            X.SQM r2 = X.SQM.A00(r1)
            boolean r1 = r2 instanceof X.QHW
            if (r1 == 0) goto L_0x0071
            r3 = 0
        L_0x0065:
            java.lang.String r0 = X.AnonymousClass1KO.A02
            if (r0 != 0) goto L_0x007d
            java.lang.String r1 = "Attempted to create a builder without a valid access token or a valid default Application ID."
            X.TQM r0 = new X.TQM
            r0.<init>(r1)
            throw r0
        L_0x0071:
            X.QHX r2 = (X.QHX) r2
            com.facebook.AccessToken r3 = r2.A00
            if (r3 != 0) goto L_0x007d
            goto L_0x0065
        L_0x0078:
            android.os.Bundle r1 = r2.getExtras()
            goto L_0x003c
        L_0x007d:
            if (r4 != 0) goto L_0x0083
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
        L_0x0083:
            X.SnX r2 = new X.SnX
            r2.<init>(r8)
            java.lang.String r1 = "app_id"
            if (r3 == 0) goto L_0x00a3
            java.lang.String r0 = r3.A01
            r4.putString(r1, r0)
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "access_token"
            r4.putString(r0, r1)
        L_0x0098:
            X.Q5J r0 = new X.Q5J
            r0.<init>(r7, r4, r2, r6)
            r8.A00 = r0
        L_0x009f:
            r0 = -205204690(0xfffffffff3c4d32e, float:-3.1188154E31)
            goto L_0x0055
        L_0x00a3:
            r4.putString(r1, r0)
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7412QBw.onCreate(android.os.Bundle):void");
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(-2083391980);
        if (this.A01 != null) {
            07M.A01(this);
            if (this.mRetainInstance) {
                this.A01.setDismissMessage((Message) null);
            }
        }
        C7412QBw.super.onDestroyView();
        AnonymousClass0fD.A09(-634950780, A02);
    }
}
