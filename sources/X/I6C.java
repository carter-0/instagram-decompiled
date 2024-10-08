package X;

import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import java.util.List;
import java.util.function.Consumer;

public final class I6C {
    public static final I6C A00 = new Object();

    public static final void A00(LongSparseArray longSparseArray, AndroidContentCaptureManager androidContentCaptureManager) {
        TranslationResponseValue value;
        CharSequence text;
        C290215ex r0;
        C290145ep r02;
        0sP r3;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < longSparseArray.size()) {
                i++;
                long keyAt = longSparseArray.keyAt(i2);
                ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(keyAt);
                if (!(viewTranslationResponse == null || (value = viewTranslationResponse.getValue("android:text")) == null || (text = value.getText()) == null || (r0 = (C290215ex) androidContentCaptureManager.A06().A03((int) keyAt)) == null || (r02 = (C290145ep) C285765So.A00(r0.A01.A05, C290125en.A0P)) == null || (r3 = r02.A01) == null)) {
                    String obj = text.toString();
                    0sn r1 = 0sn.A00;
                    r3.invoke(new C286025Tq(r1, r1, obj));
                }
            } else {
                return;
            }
        }
    }

    public static final void A02(AndroidContentCaptureManager androidContentCaptureManager, Consumer consumer, long[] jArr) {
        String A002;
        for (long j : jArr) {
            C290215ex r0 = (C290215ex) androidContentCaptureManager.A06().A03((int) j);
            if (r0 != null) {
                AnonymousClass5SX r6 = r0.A01;
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(androidContentCaptureManager.A0D.getAutofillId(), (long) r6.A02);
                List list = (List) C285765So.A00(r6.A05, AnonymousClass5SZ.A0R);
                if (!(list == null || (A002 = C290155eq.A00("\n", list)) == null)) {
                    0sn r1 = 0sn.A00;
                    builder.setValue("android:text", TranslationRequestValue.forText(new C286025Tq(r1, r1, A002)));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public final void A03(LongSparseArray longSparseArray, AndroidContentCaptureManager androidContentCaptureManager) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (0qQ.A0K(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            A00(longSparseArray, androidContentCaptureManager);
        } else {
            androidContentCaptureManager.A0D.post(new C57802Igh(longSparseArray, androidContentCaptureManager));
        }
    }
}
