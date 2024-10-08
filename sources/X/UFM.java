package X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class UFM extends 08m {
    public final DataSetObservable A00 = new DataSetObservable();
    public final 08m A01;

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.A01.destroyItem(viewGroup, i, obj);
    }

    public final void finishUpdate(ViewGroup viewGroup) {
        this.A01.finishUpdate(viewGroup);
    }

    public final int getCount() {
        return this.A01.getCount();
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return this.A01.isViewFromObject(view, obj);
    }

    public final void notifyDataSetChanged() {
        this.A01.notifyDataSetChanged();
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A00.registerObserver(dataSetObserver);
    }

    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.A01.restoreState(parcelable, classLoader);
    }

    public final Parcelable saveState() {
        return this.A01.saveState();
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.A01.setPrimaryItem(viewGroup, i, obj);
    }

    public final void startUpdate(ViewGroup viewGroup) {
        this.A01.startUpdate(viewGroup);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.A00.unregisterObserver(dataSetObserver);
    }

    public UFM(08m r3) {
        this.A01 = r3;
        r3.registerDataSetObserver(new C46665Diu(this, 2));
    }
}
