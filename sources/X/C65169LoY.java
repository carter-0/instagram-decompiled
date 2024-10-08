package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import java.util.NoSuchElementException;

/* renamed from: X.LoY  reason: case insensitive filesystem */
public final class C65169LoY implements C66483MTm {
    public final /* synthetic */ C293505kq A00;
    public final /* synthetic */ ClipsDraftRepository A01;
    public final /* synthetic */ LO6 A02;
    public final /* synthetic */ AnonymousClass3Q2 A03;
    public final /* synthetic */ AnonymousClass4D7 A04;

    public C65169LoY(C293505kq r1, ClipsDraftRepository clipsDraftRepository, LO6 lo6, AnonymousClass3Q2 r4, AnonymousClass4D7 r5) {
        this.A01 = clipsDraftRepository;
        this.A03 = r4;
        this.A02 = lo6;
        this.A04 = r5;
        this.A00 = r1;
    }

    public final void D6p(String str) {
        String A002 = AnonymousClass000.A00(147);
        this.A04.resumeWith(C41845B3m.A0c(new L42(this.A00, AnonymousClass05K.A0N)));
        AnonymousClass8A1.A01(this.A01.A04).A0N("clipsDraftRepository onCreatePendingMediaFromDraftFailed", A002);
    }

    public final void D6q(AnonymousClass3Q2 r9) {
        Object obj;
        Integer num;
        ClipsDraftRepository clipsDraftRepository = this.A01;
        clipsDraftRepository.A06.A0D(r9, r9.A35);
        C293505kq r7 = (C293505kq) C67351tA.A00(19B.A00, MHJ.A02(r9, this.A00, clipsDraftRepository, (AnonymousClass4D7) null, 32));
        ClipsDraftRepository.A07(clipsDraftRepository.A04, r7, clipsDraftRepository, this.A03);
        LO6 lo6 = this.A02;
        boolean z = lo6.A01;
        AnonymousClass4D7 r6 = this.A04;
        if (z) {
            String str = lo6.A00;
            if (str != null) {
                try {
                    Integer[] A002 = AnonymousClass05K.A00(5);
                    int i = 0;
                    int length = A002.length;
                    while (i < length) {
                        num = A002[i];
                        if (!0qQ.A0K(LIG.A01(num), str)) {
                            i++;
                        } else {
                            obj = C41845B3m.A0c(new L42(r7, num));
                        }
                    }
                    throw new NoSuchElementException(C273654mx.A00(5));
                } catch (NoSuchElementException unused) {
                    num = AnonymousClass05K.A0Y;
                }
            } else {
                0qQ.A0F("musicDownloadError");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            obj = C41845B3m.A0d(r7);
        }
        r6.resumeWith(obj);
    }
}
