package X;

import android.os.AsyncTask;
import android.util.Log;

/* renamed from: X.JdH  reason: case insensitive filesystem */
public final class C60008JdH extends AsyncTask {
    public final /* synthetic */ C14120TqF A00;
    public final /* synthetic */ MRQ A01;

    public C60008JdH(C14120TqF tqF, MRQ mrq) {
        this.A00 = tqF;
        this.A01 = mrq;
    }

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            return this.A00.A00();
        } catch (Exception e) {
            Log.e("Palette", "Exception thrown during async generate", e);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.A01.DHh((C14123TqI) obj);
    }
}
