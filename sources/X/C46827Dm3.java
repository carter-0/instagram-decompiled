package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Dm3  reason: case insensitive filesystem */
public final class C46827Dm3 extends 2Rw {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final F2A A02;
    public final List A03;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r2 != com.instagram.api.schemas.UnlockableStickerStatus.UNLOCKED) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r6, int r7) {
        /*
            r5 = this;
            X.Don r6 = (X.C46995Don) r6
            java.util.List r0 = r5.A03
            if (r0 == 0) goto L_0x005e
            java.lang.Object r4 = r0.get(r7)
            com.instagram.api.schemas.StoryUnlockableStickerData r4 = (com.instagram.api.schemas.StoryUnlockableStickerData) r4
            if (r4 == 0) goto L_0x005e
            com.instagram.api.schemas.ImageURIDict r0 = r4.C6x()
            if (r0 == 0) goto L_0x0027
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r6.A02
            com.instagram.api.schemas.ImageURIDict r0 = r4.C6x()
            java.lang.String r0 = r0.getUri()
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            X.0iw r0 = r5.A00
            r2.setUrl(r1, r0)
        L_0x0027:
            android.widget.TextView r1 = r6.A01
            java.lang.String r0 = r4.getName()
            r1.setText(r0)
            com.instagram.igds.components.button.IgdsButton r3 = r6.A03
            java.lang.String r0 = r4.getId()
            if (r0 == 0) goto L_0x0053
            com.instagram.common.session.UserSession r0 = r5.A01
            X.FYo r0 = X.C50333FYo.A00(r0)
            java.lang.String r1 = r4.getId()
            java.util.Map r0 = r0.A00
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L_0x004c
            com.instagram.api.schemas.UnlockableStickerStatus r2 = com.instagram.api.schemas.UnlockableStickerStatus.LOCKED
        L_0x004c:
            com.instagram.api.schemas.UnlockableStickerStatus r1 = com.instagram.api.schemas.UnlockableStickerStatus.UNLOCKED
            r0 = 2131975954(0x7f135f12, float:1.9589015E38)
            if (r2 == r1) goto L_0x0056
        L_0x0053:
            r0 = 2131975953(0x7f135f11, float:1.9589013E38)
        L_0x0056:
            r3.setText((int) r0)
            r0 = 46
            X.FPG.A00(r3, r0, r5, r4)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46827Dm3.onBindViewHolder(X.3kE, int):void");
    }

    public C46827Dm3(AnonymousClass0iw r1, UserSession userSession, F2A f2a, List list) {
        this.A02 = f2a;
        this.A01 = userSession;
        this.A00 = r1;
        this.A03 = list;
    }

    public final int getItemCount() {
        int size;
        int A032 = AnonymousClass0fD.A03(315510208);
        List list = this.A03;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        AnonymousClass0fD.A0A(-2024288590, A032);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C46995Don(DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.unlockable_sticker_attribution_sheet_row));
    }
}
