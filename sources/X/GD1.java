package X;

import android.view.VelocityTracker;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public final class GD1 {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public VelocityTracker A04;
    public final RecyclerView A05;
    public final C14056Tp4 A06;
    public final ViewPager2 A07;

    public GD1(RecyclerView recyclerView, C14056Tp4 tp4, ViewPager2 viewPager2) {
        this.A07 = viewPager2;
        this.A06 = tp4;
        this.A05 = recyclerView;
    }
}
