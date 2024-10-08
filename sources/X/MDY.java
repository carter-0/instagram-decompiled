package X;

import com.facebook.avatar.expresso.odr.ODRController;
import com.instagram.pendingmedia.service.impl.MediaUploader;
import java.io.File;

public final class MDY extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public final int A0D;
    public final Object A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDY(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A0D = i;
        this.A0E = obj;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.MDY, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A0D;
        this.A0C = obj;
        this.A03 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        if (i != 0) {
            return ((MediaUploader) this.A0E).A01((AnonymousClass3Q2) null, (1Cn) null, (String) null, this);
        }
        return ODRController.A01((ODRController) this.A0E, (C60787JrI) null, (C60794JrP) null, (C60795JrQ) null, (File) null, this);
    }
}
