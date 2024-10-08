package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.74n  reason: invalid class name and case insensitive filesystem */
public final class C3258774n implements AnonymousClass7YO {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final Capabilities A02;
    public final C332907Wx A03;
    public final WeakReference A04;
    public final AnonymousClass0eK A05;
    public final AnonymousClass0eK A06;

    public C3258774n(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, Capabilities capabilities, C332907Wx r6, AnonymousClass0eK r7, AnonymousClass0eK r8) {
        0qQ.A0B(r7, 4);
        0qQ.A0B(r6, 5);
        0qQ.A0B(r3, 7);
        this.A01 = userSession;
        this.A02 = capabilities;
        this.A05 = r7;
        this.A03 = r6;
        this.A06 = r8;
        this.A00 = r3;
        this.A04 = new WeakReference(fragmentActivity);
    }

    public final C74405PuL BWl(C376519Ih r18) {
        boolean z;
        FragmentActivity fragmentActivity = (FragmentActivity) this.A04.get();
        if (fragmentActivity == null) {
            return null;
        }
        UserSession userSession = this.A01;
        Capabilities capabilities = this.A02;
        Object obj = this.A05.get();
        0qQ.A07(obj);
        C333517Zg r8 = (C333517Zg) obj;
        C332907Wx r9 = this.A03;
        Object obj2 = this.A06.get();
        0qQ.A07(obj2);
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        AnonymousClass0iw r5 = this.A00;
        0qQ.A0B(r8, 3);
        C254793t3 CBU = r8.C6l().CBU();
        if (CBU != null) {
            z = CBU instanceof MsysThreadId;
            if (z) {
                return null;
            }
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        C376519Ih r4 = r18;
        arrayList.add(new PAL(fragmentActivity, r4, r5, userSession, capabilities, r8, r9, booleanValue, z));
        arrayList.add(new PAJ(fragmentActivity, r4, r5, userSession, r8, r9));
        arrayList.add(new PAI(fragmentActivity, userSession, r8, r9));
        arrayList.add(new PAK(fragmentActivity, r4, r5, userSession, capabilities, r8, r9));
        arrayList.add(new C50407FbF(fragmentActivity, r5, userSession, r8));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C74405PuL puL = (C74405PuL) it.next();
            if (puL.isEnabled()) {
                return puL;
            }
        }
        return null;
    }
}
