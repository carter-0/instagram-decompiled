package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.HoI  reason: case insensitive filesystem */
public final class C55835HoI {
    public final Fragment A00;
    public final AnonymousClass07i A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C54722HQb A04;
    public final AtomicInteger A05 = new AtomicInteger();

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.HQb] */
    public C55835HoI(Fragment fragment, AnonymousClass07i r5, AnonymousClass0iw r6, UserSession userSession) {
        this.A00 = fragment;
        this.A03 = userSession;
        this.A01 = r5;
        this.A02 = r6;
        Context requireContext = fragment.requireContext();
        String moduleName = r6.getModuleName();
        ? obj = new Object();
        obj.A00 = requireContext;
        obj.A01 = userSession;
        obj.A02 = moduleName;
        this.A04 = obj;
    }
}
