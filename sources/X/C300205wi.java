package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.DataTaskListener;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.5wi  reason: invalid class name and case insensitive filesystem */
public final class C300205wi implements DataTaskListener {
    public final /* synthetic */ 1HW A00;
    public final /* synthetic */ C300195wh A01;

    public C300205wi(1HW r1, C300195wh r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onCancelDataTask(String str, NetworkSession networkSession) {
        AnonymousClass1TA r0;
        C300195wh r1 = this.A01;
        C296065pO r02 = (C296065pO) r1.A03.remove(str);
        if (r02 != null) {
            C296065pO.A00(r02);
            r0 = r02.A04;
        } else {
            r0 = (AnonymousClass1TA) r1.A02.remove(str);
            if (r0 == null) {
                return;
            }
        }
        r0.cancel();
    }

    public final void onNewTask(DataTask dataTask, NetworkSession networkSession) {
        FileInputStream fileInputStream;
        DataTask dataTask2 = dataTask;
        int i = dataTask2.mTaskType;
        NetworkSession networkSession2 = networkSession;
        if (i == 4) {
            try {
                C300195wh r5 = this.A01;
                r5.A03.put(dataTask2.mTaskIdentifier, new C296065pO(dataTask2, networkSession2, this.A00, r5));
            } catch (IOException e) {
                0KC.A0K("IgNetworkSession", "Failed to create StreamingUploadDataTask", e);
                throw new RejectedExecutionException("Failed to create StreamingUploadDataTask");
            }
        } else {
            if (i == 3) {
                String str = dataTask2.mContentUrl;
                if (str == null) {
                    0KC.A0E("IgNetworkSession", "Null content url provided for upload task");
                    String str2 = dataTask2.mTaskCategory;
                    String str3 = dataTask2.mTaskIdentifier;
                    int i2 = dataTask2.mTaskType;
                    UrlRequest urlRequest = dataTask2.mUrlRequest;
                    NetworkUtils networkUtils = NetworkUtils.$redex_init_class;
                    UrlResponse urlResponse = UrlResponse.$redex_init_class;
                    networkSession2.markDataTaskAsCompletedCallback(str2, str3, i2, new UrlResponse(urlRequest, 0, new HashMap()), (byte[]) null, (String) null, new IOException("Null content url provided for upload task"));
                    return;
                }
                String replaceFirst = str.replaceFirst("file://", "");
                try {
                    fileInputStream = new FileInputStream(new File(replaceFirst));
                } catch (FileNotFoundException e2) {
                    0KC.A0L("IgNetworkSession", "Unable to find file %s on system", e2, new Object[]{replaceFirst});
                    String str4 = dataTask2.mTaskCategory;
                    String str5 = dataTask2.mTaskIdentifier;
                    int i3 = dataTask2.mTaskType;
                    UrlRequest urlRequest2 = dataTask2.mUrlRequest;
                    NetworkUtils networkUtils2 = NetworkUtils.$redex_init_class;
                    UrlResponse urlResponse2 = UrlResponse.$redex_init_class;
                    networkSession2.markDataTaskAsCompletedCallback(str4, str5, i3, new UrlResponse(urlRequest2, 0, new HashMap()), (byte[]) null, (String) null, new IOException(StringFormatUtil.formatStrLocaleSafe("Unable to find file %s on system", replaceFirst), e2));
                    return;
                }
            } else {
                fileInputStream = null;
            }
            1HW r12 = this.A00;
            File cacheDir = C60960kU.A00.getCacheDir();
            C299345uz r13 = new C299345uz(dataTask2, networkSession2);
            C300195wh r0 = this.A01;
            r0.A02.put(dataTask2.mTaskIdentifier, C299375v2.A00(dataTask2, r12, r13, new C299365v1(dataTask2, networkSession2, r12, r0), cacheDir, fileInputStream));
        }
    }

    public final void onUpdateStreamingDataTask(byte[] bArr, String str, NetworkSession networkSession) {
        C296065pO r2 = (C296065pO) this.A01.A03.get(str);
        if (r2 != null) {
            0nY.A00().ATE(new NSJ(this, r2, bArr));
        }
    }
}
