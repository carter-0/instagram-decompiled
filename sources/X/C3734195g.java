package X;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.UserManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.95g  reason: invalid class name and case insensitive filesystem */
public final class C3734195g {
    public static final Object A09 = new Object();
    public static final Map A0A = new 01r(0);
    public static final Executor A0B = new Object();
    public final Context A00;
    public final C3733995e A01;
    public final C3734895r A02;
    public final AnonymousClass96L A03;
    public final String A04;
    public final List A05 = new CopyOnWriteArrayList();
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final List A07 = new CopyOnWriteArrayList();
    public final AtomicBoolean A08 = new AtomicBoolean();

    public static C3734195g A00() {
        C3734195g r0;
        synchronized (A09) {
            r0 = (C3734195g) A0A.get("[DEFAULT]");
            if (r0 == null) {
                String str = C9126RPy.A00;
                if (str == null) {
                    str = Application.getProcessName();
                    C9126RPy.A00 = str;
                }
                throw new IllegalStateException(002.A0g("Default FirebaseApp is not initialized in this process ", str, ". Make sure to call FirebaseApp.initializeApp(Context) first."));
            }
        }
        return r0;
    }

    public static void A01(C3734195g r1) {
        AnonymousClass3Qk.A09(!r1.A08.get(), "FirebaseApp was deleted");
    }

    public static void A02(C3734195g r4) {
        Context context = r4.A00;
        if (!((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
            A01(r4);
            AtomicReference atomicReference = AnonymousClass9WN.A01;
            if (atomicReference.get() == null) {
                AnonymousClass9WN r2 = new AnonymousClass9WN(context);
                if (1FH.A00((Object) null, r2, atomicReference)) {
                    context.registerReceiver(r2, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        A01(r4);
        String str = r4.A04;
        C3734895r r1 = r4.A02;
        A01(r4);
        r1.A05("[DEFAULT]".equals(str));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3734195g)) {
            return false;
        }
        String str = this.A04;
        C3734195g r3 = (C3734195g) obj;
        A01(r3);
        return str.equals(r3.A04);
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public final String toString() {
        S4O s4o = new S4O(this);
        s4o.A00(this.A04, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        s4o.A00(this.A01, "options");
        return s4o.toString();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.firebase.components.ComponentRegistrar, java.lang.Object] */
    public C3734195g(Context context, C3733995e r9, String str) {
        AnonymousClass3Qk.A02(context);
        this.A00 = context;
        AnonymousClass3Qk.A04(str);
        this.A04 = str;
        AnonymousClass3Qk.A02(r9);
        this.A01 = r9;
        ArrayList arrayList = new ArrayList();
        for (String r1 : SA8.A00(context)) {
            arrayList.add(new C3734395j(r1));
        }
        Executor executor = A0B;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.add(new AX6(new Object()));
        arrayList3.add(AnonymousClass95n.A00(Context.class, context, new Class[0]));
        arrayList3.add(AnonymousClass95n.A00(C3734195g.class, this, new Class[0]));
        arrayList3.add(AnonymousClass95n.A00(C3733995e.class, r9, new Class[0]));
        this.A02 = new C3734895r(arrayList2, arrayList3, executor);
        this.A03 = new AnonymousClass96L(new AX8(context, this));
    }
}
