package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Locale;

public final class TBF implements Runnable {
    public final /* synthetic */ QCC A00;

    public TBF(QCC qcc) {
        this.A00 = qcc;
    }

    public final void run() {
        String str;
        Dialog dialog;
        Intent intent;
        Uri uri;
        Uri data;
        QCC qcc = this.A00;
        BrowserLiteFragment A0R = qcc.getParentFragmentManager().A0R("BROWSER_LITE_FRAGMENT_TAG");
        if (!(A0R instanceof BrowserLiteFragment) || (data = A0R.getIntent().getData()) == null) {
            str = "Unknown URL";
        } else {
            str = data.toString();
        }
        Activity activity = qcc.getActivity();
        if (activity != null) {
            File AXT = AnonymousClass1BA.A00(activity).AXT((1LJ) null, 1914163169);
            try {
                C9247RUy.A00(AXT);
                Bitmap bitmap = null;
                File A0s = JTO.A0s(AXT, AnonymousClass000.A00(2732));
                try {
                    C9247RUy.A00(A0s);
                    HashMap A1E = AnonymousClass7TE.A1E();
                    boolean z = activity instanceof Activity;
                    if (z) {
                        Activity activity2 = activity;
                        if (activity.getParent() != null) {
                            activity2 = activity.getParent();
                        }
                        View A0A = C66581MXm.A0A(activity2);
                        try {
                            bitmap = Bitmap.createBitmap(A0A.getWidth(), A0A.getHeight(), Bitmap.Config.ARGB_8888);
                            A0A.draw(JTO.A0B(bitmap));
                        } catch (Exception e) {
                            Object[] A1Z = Pxf.A1Z(e);
                            if (SQO.A00) {
                                String.format((Locale) null, "exception while taking screenshot: %s", A1Z);
                            }
                        }
                        if (bitmap != null) {
                            File A0s2 = JTO.A0s(A0s, "screenshot.png");
                            JTR.A1O(A0s2);
                            OutputStream outputStream = null;
                            try {
                                FileOutputStream A0t = JTO.A0t(A0s2);
                                0fO.A02(Bitmap.CompressFormat.PNG, bitmap, A0t, 100);
                                uri = Uri.fromFile(A0s2);
                                try {
                                    A0t.close();
                                } catch (IOException unused) {
                                }
                            } catch (IOException unused2) {
                                Object[] objArr = {A0s2.getAbsolutePath()};
                                if (SQO.A00) {
                                    String.format((Locale) null, "unable to write screenshot to %s", objArr);
                                }
                                try {
                                    outputStream.close();
                                } catch (IOException unused3) {
                                }
                                uri = null;
                            } catch (Throwable th) {
                                try {
                                    outputStream.close();
                                } catch (IOException unused4) {
                                }
                                throw th;
                            }
                            A1E.put("screenshot_uri", uri);
                        }
                    }
                    HashMap A1E2 = AnonymousClass7TE.A1E();
                    A1E2.put("webview_url", str);
                    A1E.put("additional_misc_info", A1E2);
                    A1E.put("raw_view_description_file_uri", (Object) null);
                    HashMap A1E3 = AnonymousClass7TE.A1E();
                    if (!(!z || (intent = activity.getIntent()) == null || intent.getExtras() == null)) {
                        A1E3.put("intent_extras", intent.getExtras().toString());
                    }
                    A1E.put("debug_info_map", A1E3);
                    BrowserLiteCallback browserLiteCallback = SRY.A00().A06;
                    if (browserLiteCallback != null) {
                        try {
                            browserLiteCallback.DbR(A1E);
                        } catch (RemoteException e2) {
                            0KC.A0J("BrowserLiteCallbacker", "Error in handleRageShake", e2);
                        }
                    }
                } catch (RCG unused5) {
                    Object[] objArr2 = {A0s.getAbsolutePath()};
                    if (SQO.A00) {
                        String.format((Locale) null, "unable to create directory: %s", objArr2);
                    }
                }
            } catch (RCG unused6) {
                Object[] objArr3 = {AXT.getAbsolutePath()};
                if (SQO.A00) {
                    String.format((Locale) null, "unable to create directory ", objArr3);
                }
            }
        }
        QC3 qc3 = qcc.A03;
        if (qc3 != null && (dialog = qc3.A01) != null) {
            dialog.dismiss();
        }
    }
}
