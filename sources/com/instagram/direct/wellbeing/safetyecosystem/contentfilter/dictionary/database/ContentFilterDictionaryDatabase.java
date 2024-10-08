package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database;

import X.AnonymousClass92R;
import X.AnonymousClass92T;
import X.AnonymousClass92U;
import com.instagram.roomdb.IgRoomDatabase;

public abstract class ContentFilterDictionaryDatabase extends IgRoomDatabase {
    public static final AnonymousClass92R A00 = new Object();

    public final AnonymousClass92U A00() {
        AnonymousClass92U r0;
        ContentFilterDictionaryDatabase_Impl contentFilterDictionaryDatabase_Impl = (ContentFilterDictionaryDatabase_Impl) this;
        if (contentFilterDictionaryDatabase_Impl.A00 != null) {
            return contentFilterDictionaryDatabase_Impl.A00;
        }
        synchronized (contentFilterDictionaryDatabase_Impl) {
            if (contentFilterDictionaryDatabase_Impl.A00 == null) {
                contentFilterDictionaryDatabase_Impl.A00 = new AnonymousClass92U(contentFilterDictionaryDatabase_Impl);
            }
            r0 = contentFilterDictionaryDatabase_Impl.A00;
        }
        return r0;
    }

    public final AnonymousClass92T A01() {
        AnonymousClass92T r0;
        ContentFilterDictionaryDatabase_Impl contentFilterDictionaryDatabase_Impl = (ContentFilterDictionaryDatabase_Impl) this;
        if (contentFilterDictionaryDatabase_Impl.A01 != null) {
            return contentFilterDictionaryDatabase_Impl.A01;
        }
        synchronized (contentFilterDictionaryDatabase_Impl) {
            if (contentFilterDictionaryDatabase_Impl.A01 == null) {
                contentFilterDictionaryDatabase_Impl.A01 = new AnonymousClass92T(contentFilterDictionaryDatabase_Impl);
            }
            r0 = contentFilterDictionaryDatabase_Impl.A01;
        }
        return r0;
    }
}
