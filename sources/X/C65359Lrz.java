package X;

import android.view.View;

/* renamed from: X.Lrz  reason: case insensitive filesystem */
public final class C65359Lrz implements MVB {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65359Lrz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0058, code lost:
        r1.A08();
        r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        X.DbS.A1U(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onButtonClick(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x001d;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x000b;
                case 5: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A01
        L_0x0007:
            X.DbS.A1U(r0)
            return
        L_0x000b:
            java.lang.Object r0 = r3.A02
            goto L_0x0007
        L_0x000e:
            java.lang.Object r1 = r3.A02
            com.instagram.tagging.activity.TaggingActivity r1 = (com.instagram.tagging.activity.TaggingActivity) r1
            java.lang.Object r0 = r3.A01
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = (com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta) r0
            r1.A0D = r0
            r0 = 1
            com.instagram.tagging.activity.TaggingActivity.A0Q(r1, r0)
            return
        L_0x001d:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            X.UwM r1 = X.C16517UwM.HIGHLIGHTS
            java.lang.String r0 = "archive_stories_tab"
            r2.putSerializable(r0, r1)
            X.KiM r1 = X.C62589KiM.STORY
            java.lang.String r0 = "archive_home_tab_mode"
            r2.putSerializable(r0, r1)
            java.lang.Object r1 = r3.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r3.A02
            X.0lg r0 = (X.0lg) r0
            X.6Yo r1 = X.DbS.A0M(r1, r0)
            com.instagram.archive.fragment.ArchiveHomeFragment r0 = new com.instagram.archive.fragment.ArchiveHomeFragment
            r0.<init>()
            r1.A0B(r2, r0)
            goto L_0x0058
        L_0x0044:
            java.lang.Object r1 = r3.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r3.A02
            X.0lg r0 = (X.0lg) r0
            X.6Yo r1 = X.DbS.A0M(r1, r0)
            com.instagram.archive.fragment.ArchiveHomeFragment r0 = new com.instagram.archive.fragment.ArchiveHomeFragment
            r0.<init>()
            r1.A0D(r0)
        L_0x0058:
            r1.A08()
            r1.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65359Lrz.onButtonClick(android.view.View):void");
    }

    public final void onDismiss() {
        switch (this.A00) {
            case 2:
                ((L1A) this.A02).A00 = null;
                return;
            case 3:
                ((L1B) this.A02).A00 = null;
                return;
            case 4:
                ((LO0) this.A01).A00(false);
                return;
            default:
                return;
        }
    }

    public final void onShow() {
        if (4 - this.A00 == 0) {
            ((LO0) this.A01).A00(true);
        }
    }

    public final /* synthetic */ void onTextClick(View view) {
    }
}
