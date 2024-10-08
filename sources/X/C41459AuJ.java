package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.List;

/* renamed from: X.AuJ  reason: case insensitive filesystem */
public final /* synthetic */ class C41459AuJ implements 0sP {
    public final /* synthetic */ AnonymousClass80R A00;

    public /* synthetic */ C41459AuJ(AnonymousClass80R r1) {
        this.A00 = r1;
    }

    public final Object invoke(Object obj) {
        AnonymousClass80R r3 = this.A00;
        C381539bv r8 = (C381539bv) obj;
        r3.A0a.A0D(false);
        String A0c = AnonymousClass7TF.A0c();
        int ordinal = r3.A0o.A02.A01().ordinal();
        if (ordinal == 0) {
            AnonymousClass8K4.A0A(r3.A0c, new LD4((DirectShareTarget) null, (UserStoryTarget) null, ShareType.NOTE_MEDIA_REPLY), r8, (C15023UKc) null, (Boolean) null, A0c, (String) null);
        } else if (ordinal == 1) {
            AnonymousClass8LU r4 = r3.A0g;
            AnonymousClass8L1 r32 = r4.A0g;
            if (!r32.A00) {
                r4.A0I();
                AnonymousClass8PW A0G = r4.A0G();
                r32.A06(r4, r4.A0m.A00.A0h.A00(), new LD4((DirectShareTarget) null, (UserStoryTarget) null, ShareType.NOTE_MEDIA_REPLY), A0G, r8, r4.A0C, (DirectCameraViewModel) null, (C381779cJ) null, (L8M) null, (AnonymousClass8VT) null, (Boolean) null, AnonymousClass05K.A00, A0c, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 1, r4.A0f.A0p(), false, false);
            }
        } else {
            throw AnonymousClass7TE.A1B("Unknown media type");
        }
        return C60340gF.A00;
    }
}
