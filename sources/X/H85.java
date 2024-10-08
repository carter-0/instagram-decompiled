package X;

import com.facebook.stash.core.FileStash;
import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class H85 extends 0ng {
    public final /* synthetic */ IOK A00;

    public final void run() {
        String str;
        IOK iok = this.A00;
        ConcurrentHashMap concurrentHashMap = iok.A04;
        FileStash fileStash = iok.A00;
        HashMap A1E = AnonymousClass7TE.A1E();
        Set allKeys = fileStash.getAllKeys();
        0qQ.A07(allKeys);
        int size = allKeys.size();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = allKeys.iterator();
        int i = 0;
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            InputStream read = fileStash.read(A18);
            if (read != null) {
                try {
                    C268554db A02 = C268554db.A02();
                    A02.A0I(C269424f6.FAIL_ON_EMPTY_BEANS);
                    ParcelableSignalData parcelableSignalData = (ParcelableSignalData) A02.A0B(A02.A09.A01(read), A02.A05.A09(ParcelableSignalData.class));
                    C254393sP r0 = C254393sP.A00;
                    0qQ.A0A(parcelableSignalData);
                    AnonymousClass9IV A022 = r0.A02(parcelableSignalData);
                    A1E.put(A18, A022);
                    iok.A02.EGY(A022, A18);
                    i++;
                } catch (IOException e) {
                    e = e;
                    str = "Error reading SignalBundle file into JsonNode: ";
                } catch (ExceptionInInitializerError e2) {
                    e = e2;
                    str = "Error init objectMapper: ";
                } catch (Exception e3) {
                    e = e3;
                    str = "Error when read disk cache: ";
                } catch (NoClassDefFoundError unused) {
                    0KC.A0C("AsyncSignalDataPersistentStorage", "FbObjectMapper class not found, skipping init");
                }
            }
        }
        iok.A02.EGb(size, i, (double) C51966G9m.A07(currentTimeMillis));
        fileStash.getItemCount();
        A1E.size();
        concurrentHashMap.putAll(A1E);
        return;
        0KC.A0F("AsyncSignalDataPersistentStorage", str, e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H85(IOK iok, int i) {
        super(213216919, i, false, false);
        this.A00 = iok;
    }
}
