package X;

import com.facebook.react.uimanager.ViewManager;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;

/* renamed from: X.USf  reason: case insensitive filesystem */
public final class C15149USf extends C19062WIs {
    public final C17763VfZ A00;
    public final QZL A01;
    public final String A02;
    public final /* synthetic */ C18592Vuj A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15149USf(C17763VfZ vfZ, QZL qzl, C18592Vuj vuj, String str, int i) {
        super(vuj, i);
        this.A03 = vuj;
        this.A01 = qzl;
        this.A02 = str;
        this.A00 = vfZ;
        Systrace.A07(33554432, "createView", this.A00);
    }

    public final void AT8() {
        int i = this.A00;
        Systrace.A05(33554432, "createView", i);
        W0R w0r = this.A03.A0L;
        QZL qzl = this.A01;
        String str = this.A02;
        C17763VfZ vfZ = this.A00;
        synchronized (w0r) {
            0et A002 = SystraceMessage.A00(SystraceMessage.A00, "NativeViewHierarchyManager_createView", 33554432);
            A002.A01("tag", i);
            A002.A00(str, "className");
            A002.A02();
            try {
                ViewManager A003 = w0r.A07.A00(str);
                w0r.A03.put(i, A003.createView(i, qzl, vfZ, (C20831X0g) null, w0r.A05));
                w0r.A02.put(i, A003);
                0fc.A00(33554432, 892176907);
            } finally {
                0fc.A00(33554432, -1006303975);
            }
        }
    }
}
