package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.facebook.location.platform.api.Location;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Q6l  reason: case insensitive filesystem */
public final class C7356Q6l extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ConnectivityManager A00;
    public final /* synthetic */ C10931S1j A01;
    public final /* synthetic */ AtomicBoolean A02;

    public final void onAvailable(Network network) {
        Object obj;
        C10211RoS roS;
        0qQ.A0B(network, 0);
        this.A02.set(true);
        this.A00.unregisterNetworkCallback(this);
        try {
            C10931S1j s1j = this.A01;
            S18 s18 = new S18(network, s1j.A01);
            if (s1j instanceof QQB) {
                QQB qqb = (QQB) s1j;
                String str = qqb.A02;
                11S r6 = new 11S(qqb.A01);
                HttpURLConnection A002 = s18.A00(new URL(str));
                A002.setInstanceFollowRedirects(false);
                0fi.A02(A002, 591742661);
                int responseCode = A002.getResponseCode();
                int i = 0;
                while (true) {
                    if (responseCode / 100 != 3 || i >= 10) {
                        A002.disconnect();
                        String responseMessage = A002.getResponseMessage();
                        0qQ.A07(responseMessage);
                        roS = new C10211RoS(002.A0W("unexpected_response_", responseMessage, '_', A002.getResponseCode()));
                    } else {
                        String headerField = A002.getHeaderField(Location.TAG);
                        A002.disconnect();
                        0qQ.A0A(headerField);
                        if (headerField.length() == 0) {
                            roS = new QQ7();
                            break;
                        } else if (r6.A08(headerField)) {
                            obj = new QQ4(headerField);
                            break;
                        } else {
                            A002 = s18.A00(new URL(headerField));
                            A002.setInstanceFollowRedirects(false);
                            0fi.A02(A002, 591742661);
                            responseCode = A002.getResponseCode();
                            i++;
                        }
                    }
                }
                obj = new QQ3(roS);
                if (obj instanceof QQ4) {
                    qqb.A00.Doe(((QQ4) obj).A00);
                } else if (obj instanceof QQ3) {
                    qqb.A00.DEY(((QQ3) obj).A00);
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            } else {
                QQA qqa = (QQA) s1j;
                HttpURLConnection A003 = s18.A00(new URL(qqa.A01));
                0fi.A02(A003, -1448468238);
                boolean A1S = AnonymousClass7TF.A1S(A003.getResponseCode() / 100, 2);
                C13711TfY tfY = qqa.A00;
                if (A1S) {
                    BufferedReader A0X = Pxg.A0X(0fi.A00(A003, -1844687473));
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    while (true) {
                        String readLine = A0X.readLine();
                        if (readLine == null) {
                            break;
                        }
                        A1A.append(readLine);
                    }
                    tfY.Doe(DbT.A10(A1A));
                } else {
                    String responseMessage2 = A003.getResponseMessage();
                    0qQ.A07(responseMessage2);
                    tfY.DEY(new C10211RoS(002.A0W("unexpected_response_", responseMessage2, '_', A003.getResponseCode())));
                }
                A003.disconnect();
            }
        } catch (IOException | Exception | SocketTimeoutException e) {
            C13711TfY tfY2 = this.A01.A00;
            0Yh message = e.getMessage();
            if (message == null) {
                message = DbS.A0z(e.getClass());
            }
            tfY2.DEY(new C10211RoS(String.valueOf(message)));
        }
    }

    public C7356Q6l(ConnectivityManager connectivityManager, C10931S1j s1j, AtomicBoolean atomicBoolean) {
        this.A02 = atomicBoolean;
        this.A00 = connectivityManager;
        this.A01 = s1j;
    }

    public final void onUnavailable() {
        this.A02.set(true);
        this.A00.unregisterNetworkCallback(this);
        this.A01.A00.DEY(new QQ9());
    }
}
