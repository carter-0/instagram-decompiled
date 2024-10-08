package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.common.session.UserSession;

/* renamed from: X.82V  reason: invalid class name */
public final class AnonymousClass82V extends 0Yg implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ GalleryPickerServiceDataSource A01;
    public final /* synthetic */ C312136ds A02;
    public final /* synthetic */ C3497681r A03;
    public final /* synthetic */ C3496181b A04;
    public final /* synthetic */ IgCameraEffectsController A05;
    public final /* synthetic */ C312196dz A06;
    public final /* synthetic */ AnonymousClass82A A07;
    public final /* synthetic */ UserSession A08;
    public final /* synthetic */ C357638Yz A09;
    public final /* synthetic */ AnonymousClass823 A0A;
    public final /* synthetic */ AnonymousClass80D A0B;
    public final /* synthetic */ AnonymousClass829 A0C;
    public final /* synthetic */ C3496481e A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ AnonymousClass0eM A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82V(Context context, GalleryPickerServiceDataSource galleryPickerServiceDataSource, C312136ds r4, C3497681r r5, C3496181b r6, IgCameraEffectsController igCameraEffectsController, C312196dz r8, AnonymousClass82A r9, UserSession userSession, C357638Yz r11, AnonymousClass823 r12, AnonymousClass80D r13, AnonymousClass829 r14, C3496481e r15, String str, AnonymousClass0eM r17) {
        super(0);
        this.A00 = context;
        this.A08 = userSession;
        this.A03 = r5;
        this.A02 = r4;
        this.A0E = str;
        this.A0D = r15;
        this.A09 = r11;
        this.A01 = galleryPickerServiceDataSource;
        this.A0A = r12;
        this.A0B = r13;
        this.A0C = r14;
        this.A07 = r9;
        this.A06 = r8;
        this.A04 = r6;
        this.A05 = igCameraEffectsController;
        this.A0F = r17;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A00;
        UserSession userSession = this.A08;
        C3497681r r3 = this.A03;
        GalleryPickerServiceDataSource galleryPickerServiceDataSource = this.A01;
        AnonymousClass823 r11 = this.A0A;
        AnonymousClass80D r0 = this.A0B;
        C342837pF r10 = r0.A0e;
        C342847pG r9 = r0.A0c;
        AnonymousClass829 r12 = this.A0C;
        AnonymousClass82A r7 = this.A07;
        return new AnonymousClass82X(context, galleryPickerServiceDataSource, r3, this.A04, this.A05, this.A06, r7, userSession, r9, r10, r11, r12, this.A0F);
    }
}
