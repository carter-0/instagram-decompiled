package X;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.SdG  reason: case insensitive filesystem */
public final class C11613SdG implements AnonymousClass03R {
    public final /* synthetic */ C13426TaC A00;

    public C11613SdG(C13426TaC taC) {
        this.A00 = taC;
    }

    public final AnonymousClass02h Dbd(View view, AnonymousClass02h r12) {
        Pair create;
        Pair create2;
        C11609SdC sdC = C11609SdC.A00;
        ClipData Anj = r12.A00.Anj();
        AnonymousClass02h r4 = null;
        if (Anj.getItemCount() == 1) {
            AnonymousClass02h r0 = r12;
            if (!sdC.test(Anj.getItemAt(0))) {
                r0 = null;
                r4 = r12;
            }
            create2 = Pair.create(r0, r4);
        } else {
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (int i = 0; i < Anj.getItemCount(); i++) {
                ClipData.Item itemAt = Anj.getItemAt(i);
                if (sdC.test(itemAt)) {
                    if (arrayList == null) {
                        arrayList = AnonymousClass7TE.A1C();
                    }
                    arrayList.add(itemAt);
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = AnonymousClass7TE.A1C();
                    }
                    arrayList2.add(itemAt);
                }
            }
            if (arrayList == null) {
                create = Pair.create((Object) null, Anj);
            } else if (arrayList2 == null) {
                create = Pair.create(Anj, (Object) null);
            } else {
                ClipData clipData = new ClipData(new ClipDescription(Anj.getDescription()), (ClipData.Item) arrayList.get(0));
                for (int i2 = 1; i2 < arrayList.size(); i2++) {
                    clipData.addItem((ClipData.Item) arrayList.get(i2));
                }
                ClipData clipData2 = new ClipData(new ClipDescription(Anj.getDescription()), (ClipData.Item) arrayList2.get(0));
                for (int i3 = 1; i3 < arrayList2.size(); i3++) {
                    clipData2.addItem((ClipData.Item) arrayList2.get(i3));
                }
                create = Pair.create(clipData, clipData2);
            }
            if (create.first == null) {
                create2 = Pair.create((Object) null, r12);
            } else if (create.second == null) {
                create2 = Pair.create(r12, (Object) null);
            } else {
                AnonymousClass02f r02 = new AnonymousClass02e(r12).A00;
                r02.ERf((ClipData) create.first);
                AnonymousClass02h AED = r02.AED();
                AnonymousClass02f r03 = new AnonymousClass02e(r12).A00;
                r03.ERf((ClipData) create.second);
                create2 = Pair.create(AED, r03.AED());
            }
        }
        0qQ.A07(create2);
        AnonymousClass02h r04 = (AnonymousClass02h) create2.first;
        AnonymousClass02h r9 = (AnonymousClass02h) create2.second;
        if (r04 != null) {
            C13426TaC taC = this.A00;
            ClipData Anj2 = r04.A00.Anj();
            0qQ.A07(Anj2);
            int itemCount = Anj2.getItemCount();
            for (int i4 = 0; i4 < itemCount; i4++) {
                Uri uri = Anj2.getItemAt(i4).getUri();
                if (uri != null) {
                    String obj = uri.toString();
                    C12190Sof sof = (C12190Sof) taC;
                    C245983dn.A01(new TJV(sof.A00, sof.A01, sof.A02, obj));
                }
            }
        }
        return r9;
    }
}
