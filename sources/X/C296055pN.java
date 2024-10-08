package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.5pN  reason: invalid class name and case insensitive filesystem */
public final class C296055pN extends AnonymousClass45Y {
    public final /* synthetic */ C268654dm A00;
    public final /* synthetic */ C299365v1 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C296055pN(C268654dm r2, C299365v1 r3) {
        super("performDataTask");
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void run() {
        IOException iOException;
        try {
            C299365v1 r1 = this.A01;
            DataTask dataTask = r1.A00;
            String str = dataTask.mTaskCategory;
            String str2 = dataTask.mTaskIdentifier;
            int i = dataTask.mTaskType;
            C268654dm r3 = this.A00;
            if (r3 instanceof C268674do) {
                Object A002 = r3.A00();
                A002.getClass();
                C296045pM r32 = (C296045pM) A002;
                File file = r32.A01;
                try {
                    boolean z = true;
                    if (dataTask.mTaskType != 0 || dataTask.mTaskMode != 1) {
                        z = false;
                    }
                    String str3 = null;
                    if (z) {
                        r1.A01.markDataTaskStreamingCompletedCallback(str, str2, r32.A00, (Throwable) null);
                    } else {
                        NetworkSession networkSession = r1.A01;
                        UrlResponse urlResponse = r32.A00;
                        byte[] bArr = r32.A02;
                        if (file != null) {
                            str3 = file.getCanonicalPath();
                        }
                        networkSession.markDataTaskAsCompletedCallback(str, str2, i, urlResponse, bArr, str3, (IOException) null);
                    }
                } catch (IOException e) {
                    0KC.A0F("IgNetworkSession", "IOException while executing markDataTaskCompleted", e);
                    if (dataTask.mTaskType == 0 && dataTask.mTaskMode == 1) {
                        r1.A01.markDataTaskStreamingCompletedCallback(str, str2, r32.A00, e);
                    } else {
                        r1.A01.markDataTaskAsCompletedCallback(str, str2, i, r32.A00, r32.A02, (String) null, e);
                    }
                } catch (Throwable th) {
                    if (file != null) {
                        file.delete();
                    }
                    throw th;
                }
                if (file != null) {
                    file.delete();
                }
            } else {
                Throwable A012 = r3.A01();
                A012.getClass();
                NetworkSession networkSession2 = r1.A01;
                UrlRequest urlRequest = dataTask.mUrlRequest;
                NetworkUtils networkUtils = NetworkUtils.$redex_init_class;
                UrlResponse urlResponse2 = UrlResponse.$redex_init_class;
                UrlResponse urlResponse3 = new UrlResponse(urlRequest, 0, new HashMap());
                if (A012 instanceof IOException) {
                    iOException = (IOException) A012;
                } else {
                    iOException = new IOException(A012);
                }
                networkSession2.markDataTaskAsCompletedCallback(str, str2, i, urlResponse3, (byte[]) null, (String) null, iOException);
            }
            String str4 = dataTask.mTaskIdentifier;
            C300195wh r12 = r1.A03;
            C296065pO r0 = (C296065pO) r12.A03.remove(str4);
            if (r0 != null) {
                C296065pO.A00(r0);
            }
            r12.A02.remove(str4);
        } catch (Throwable th2) {
            C299365v1 r13 = this.A01;
            String str5 = r13.A00.mTaskIdentifier;
            C300195wh r14 = r13.A03;
            C296065pO r02 = (C296065pO) r14.A03.remove(str5);
            if (r02 != null) {
                C296065pO.A00(r02);
            }
            r14.A02.remove(str5);
            throw th2;
        }
    }
}
