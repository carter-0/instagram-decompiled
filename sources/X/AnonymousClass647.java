package X;

import android.content.Intent;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

/* renamed from: X.647  reason: invalid class name */
public interface AnonymousClass647 extends AnonymousClass648 {
    void AJG(AnonymousClass64Q r1);

    void APT(String str);

    void Blb(IAccountAccessor iAccountAccessor, Set set);

    Intent BwH();

    boolean CQT();

    boolean E57();

    void disconnect();

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    int getMinApkVersion();

    boolean isConnected();

    boolean requiresSignIn();
}
