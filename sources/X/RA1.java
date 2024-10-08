package X;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

public final class RA1 extends 0ng {
    public final /* synthetic */ SFU A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RA1(SFU sfu) {
        super(625, 4, false, false);
        this.A00 = sfu;
    }

    public final void run() {
        long j;
        long j2;
        File externalFilesDir;
        SFU sfu = this.A00;
        if (!sfu.A00) {
            Context context = sfu.A01;
            if (SFU.A05 == null && (externalFilesDir = context.getExternalFilesDir((String) null)) != null) {
                SFU.A05 = externalFilesDir;
            }
            if (SFU.A06 == null) {
                SFU.A06 = context.getCacheDir();
            }
            sfu.A00 = true;
        }
        try {
            02m r10 = sfu.A02;
            r10.markerStart(57868289);
            StatFs statFs = new StatFs(SFU.A06.getAbsolutePath());
            long availableBlocksLong = (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576;
            StatFs statFs2 = new StatFs(SFU.A06.getAbsolutePath());
            long blockCountLong = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / 1048576;
            File file = SFU.A05;
            if (file == null) {
                j = 0;
            } else {
                StatFs statFs3 = new StatFs(file.getAbsolutePath());
                j = statFs3.getAvailableBlocksLong() * statFs3.getBlockSizeLong();
            }
            long j3 = j / 1048576;
            File file2 = SFU.A05;
            if (file2 == null) {
                j2 = 0;
            } else {
                StatFs statFs4 = new StatFs(file2.getAbsolutePath());
                j2 = statFs4.getBlockCountLong() * statFs4.getBlockSizeLong();
            }
            boolean isExternalStorageEmulated = Environment.isExternalStorageEmulated();
            boolean isExternalStorageRemovable = Environment.isExternalStorageRemovable();
            r10.markerAnnotate(57868289, "external_emulated", isExternalStorageEmulated);
            r10.markerAnnotate(57868289, "external_removable", isExternalStorageRemovable);
            r10.markerAnnotate(57868289, "internal_free_mb", availableBlocksLong);
            r10.markerAnnotate(57868289, "internal_total_mb", blockCountLong);
            r10.markerAnnotate(57868289, "external_free_mb", j3);
            r10.markerAnnotate(57868289, "external_total_mb", j2 / 1048576);
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            ArrayList A1C4 = AnonymousClass7TE.A1C();
            JSONArray A1E = Pxe.A1E();
            Iterator A1G = AnonymousClass7TE.A1G(sfu.A03);
            while (A1G.hasNext()) {
                AnonymousClass3Q2 r4 = (AnonymousClass3Q2) AnonymousClass7TF.A0a(A1G);
                long seconds = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - Long.parseLong(r4.A3t));
                ArrayList A1C5 = AnonymousClass7TE.A1C();
                if (!0qQ.A0K(r4.A1N, C376399Hv.A00())) {
                    A1C5.add(r4.A1N.A0F);
                }
                List<ClipInfo> list = r4.A4G;
                if (list != null) {
                    for (ClipInfo clipInfo : list) {
                        A1C5.add(clipInfo.A0F);
                    }
                }
                A1C5.add(r4.A3V);
                A1C5.add(r4.A3m);
                A1C5.add(r4.A33);
                A1C5.add(r4.A2k);
                A1C5.add(r4.A3Z);
                for (C60895JtF jtF : r4.A1j.A06) {
                    A1C5.add(jtF.A06);
                }
                List list2 = r4.A4a;
                if (list2 != null && AnonymousClass7TE.A1b(list2)) {
                    List<C282745Eo> list3 = r4.A4a;
                    if (list3 != null) {
                        for (C282745Eo r0 : list3) {
                            A1C5.add(r0.A05);
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                Iterator it = A1C5.iterator();
                long j4 = 0;
                while (it.hasNext()) {
                    j4 += 0mb.A03(AnonymousClass7TE.A18(it));
                }
                Long valueOf = Long.valueOf(seconds);
                Long valueOf2 = Long.valueOf(j4 / 1024);
                A1C.add(valueOf);
                A1C2.add(valueOf2);
                A1C3.add(r4.A07().name());
                A1C4.add(r4.A0E().name());
                A1E.put(C66580MXl.A17(AnonymousClass3Q1.A00(r4)));
            }
            Object[] array = A1C.toArray();
            int length = array.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = AnonymousClass7TE.A0R(Pxe.A0t(array, i));
            }
            r10.markerAnnotate(57868289, "age_sec_array", jArr);
            Object[] array2 = A1C2.toArray();
            int length2 = array2.length;
            long[] jArr2 = new long[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                jArr2[i2] = AnonymousClass7TE.A0R(Pxe.A0t(array2, i2));
            }
            r10.markerAnnotate(57868289, "footage_kb_array", jArr2);
            SFU.A00(sfu, "age_sec", A1C);
            SFU.A00(sfu, "footage_kb", A1C2);
            r10.markerAnnotate(57868289, "media_type_array", (String[]) PzX.A00(A1C3).A03());
            r10.markerAnnotate(57868289, "share_type_array", (String[]) PzX.A00(A1C4).A03());
            r10.markerAnnotate(57868289, "media_json_array", String.valueOf(A1E));
            r10.markerEnd(57868289, 2);
        } catch (Throwable th) {
            sfu.A02.markerEnd(57868289, 3);
            0wb.A07("ingestion_disk_footage_err", th);
        }
    }
}
