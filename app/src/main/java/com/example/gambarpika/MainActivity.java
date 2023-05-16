package com.example.gambarpika;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Canvas mCanvas;
    private Paint mPaint = new Paint();
    private Bitmap mBitmap;
    private ImageView mImageView;
    private Rect mRect = new Rect();
    private Rect mBounds = new Rect();

    private int count = 0;

    private int mColorRect1;
    private int mColorRect2;
    private int mColorEyes;
    private int mColorRetina;
    private int mColorCheek;
    private int mColorMouth;
    private int mColorTongue;
    private int mColorEars;
    private int mColorEars2;
    private int mColorNose;
    private int mColorTail;
    private int mColorFoot1;
    private int mColorFoot2;
    private int mColorFloor;
    private int mColorSky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mColorRect1 = ResourcesCompat.getColor(getResources(),
                R.color.rect_1,null);
        mColorRect2 = ResourcesCompat.getColor(getResources(),
                R.color.rect_2,null);
        mColorEyes = ResourcesCompat.getColor(getResources(),
                R.color.eyes,null);
        mColorRetina = ResourcesCompat.getColor(getResources(),
                R.color.retina,null);
        mColorCheek = ResourcesCompat.getColor(getResources(),
                R.color.cheek,null);
        mColorMouth = ResourcesCompat.getColor(getResources(),
                R.color.mouth,null);
        mColorTongue = ResourcesCompat.getColor(getResources(),
                R.color.tongue,null);
        mColorEars = ResourcesCompat.getColor(getResources(),
                R.color.ears,null);
        mColorEars2 = ResourcesCompat.getColor(getResources(),
                R.color.ears2,null);
        mColorNose = ResourcesCompat.getColor(getResources(),
                R.color.nose,null);
        mColorTail = ResourcesCompat.getColor(getResources(),
                R.color.tail,null);
        mColorFoot1 = ResourcesCompat.getColor(getResources(),
                R.color.foot1,null);
        mColorFoot2 = ResourcesCompat.getColor(getResources(),
                R.color.foot2,null);
        mColorFloor = ResourcesCompat.getColor(getResources(),
                R.color.floor,null);
        mColorSky = ResourcesCompat.getColor(getResources(),
                R.color.sky,null);

        mImageView = findViewById(R.id.myImageView);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawSomething(v);
            }
        });
    }

    public void drawSomething(View view){
        int vWidth = view.getWidth();
        int vHeight = view.getHeight();
        int halfWidth = vWidth/2;
        int halfHeight = vHeight/2;

        if (count == 0){
            mBitmap = Bitmap.createBitmap(vWidth, vHeight,
                    Bitmap.Config.ARGB_8888);
            mImageView.setImageBitmap(mBitmap);
            mCanvas = new Canvas(mBitmap);

            mCanvas.drawColor(mColorSky);
            count += 1;
        } else if (count == 1) {
            mPaint.setColor(mColorFloor);

            mRect.set(0, halfHeight,vWidth,
                    vHeight);
            mCanvas.drawRect(mRect, mPaint);
            count += 1;
        } else if (count == 2) {
            mPaint.setColor(mColorTail);

            Point a = new Point(halfWidth + 20, halfHeight - 100);
            Point b = new Point(halfWidth + 120, halfHeight - 250);
            Point c = new Point(halfWidth + 40, halfHeight - 450);
            Point d = new Point(halfWidth + 450, halfHeight - 600);
            Point e = new Point(halfWidth + 400, halfHeight - 380);
            Point f = new Point(halfWidth + 250, halfHeight - 330);
            Point g = new Point(halfWidth + 280, halfHeight - 180);
            Point h = new Point(halfWidth + 50, halfHeight);
            Path path = new Path();
            path.setFillType(Path.FillType.EVEN_ODD);
            path.lineTo(a.x, a.y);
            path.lineTo(b.x, b.y);
            path.lineTo(c.x, c.y);
            path.lineTo(d.x, d.y);
            path.lineTo(e.x, e.y);
            path.lineTo(f.x, f.y);
            path.lineTo(g.x, g.y);
            path.lineTo(h.x, h.y);
            path.lineTo(a.x, a.y);
            mCanvas.drawPath(path, mPaint);
            count += 1;
        } else if (count == 3) {
            mPaint.setColor(mColorRect1);

            mRect.set(halfWidth - 300, halfHeight - 250,
                    halfWidth + 300, halfHeight + 350);
            mCanvas.drawRect(mRect, mPaint);
            count += 1;
        } else if (count == 4) {
            mPaint.setColor(mColorRect2);

            mRect.set(halfWidth - 280, halfHeight - 230,
                    halfWidth + 280, halfHeight + 330);
            mCanvas.drawRect(mRect, mPaint);
            count += 1;
        } else if (count == 5) {
            mPaint.setColor(mColorEyes);

            mRect.set(halfWidth - 210, halfHeight - 130,
                    halfWidth - 80, halfHeight);
            mCanvas.drawRect(mRect, mPaint);
            mRect.set(halfWidth + 80, halfHeight - 130,
                    halfWidth + 210, halfHeight);
            mCanvas.drawRect(mRect, mPaint);
            count += 1;
        } else if (count == 6) {
            mPaint.setColor(mColorRetina);

            mRect.set(halfWidth - 160, halfHeight - 110,
                    halfWidth - 110, halfHeight - 60);
            mCanvas.drawRect(mRect, mPaint);
            mRect.set(halfWidth + 110, halfHeight - 110,
                    halfWidth + 160, halfHeight - 60);
            mCanvas.drawRect(mRect, mPaint);
            count += 1;
        } else if (count == 7) {
            mPaint.setColor(mColorCheek);

            mRect.set(halfWidth - 280, halfHeight + 50,
                    halfWidth - 160, halfHeight + 170);
            mCanvas.drawRect(mRect, mPaint);
            mRect.set(halfWidth + 160, halfHeight + 50,
                    halfWidth + 280, halfHeight + 170);
            mCanvas.drawRect(mRect, mPaint);
            count += 1;
        } else if (count == 8) {
            mPaint.setColor(mColorMouth);

            mRect.set(halfWidth - 110, halfHeight + 130,
                    halfWidth + 110, halfHeight + 230);
            mCanvas.drawRect(mRect, mPaint);
            // Menggambar Segitiga
            Point a = new Point(halfWidth, halfHeight + 80);
            Point b = new Point(halfWidth + 30, halfHeight + 130);
            Point c = new Point(halfWidth - 30, halfHeight + 130);
            Path path = new Path();
            // even odd ngasih color yg ada di dalam path
            path.setFillType(Path.FillType.EVEN_ODD);
            path.lineTo(a.x, a.y);
            path.lineTo(b.x, b.y);
            path.lineTo(c.x, c.y);
            // path di bawah ini untuk menutup sehingga garis kembali ke titik awal
            // jika tidak dikasih dan path ditutup maka garis kembali ke titi 0,0
            path.lineTo(a.x, a.y);
            mCanvas.drawPath(path, mPaint);
            count += 1;
        } else if (count == 9) {
            mPaint.setColor(mColorTongue);

            mRect.set(halfWidth - 80, halfHeight + 190,
                    halfWidth + 80, halfHeight + 220);
            mCanvas.drawRect(mRect, mPaint);
            count += 1;
        } else if (count == 10) {
            mPaint.setColor(mColorNose);

            mRect.set(halfWidth - 25, halfHeight + 40,
                    halfWidth + 25, halfHeight + 60);
            mCanvas.drawRect(mRect, mPaint);
            count += 1;
        } else if (count == 11) {
            mPaint.setColor(mColorEars2);

            mRect.set(halfWidth - 230, halfHeight - 450,
                    halfWidth - 90, halfHeight - 250);
            mCanvas.drawRect(mRect, mPaint);
            mRect.set(halfWidth + 90, halfHeight - 450,
                    halfWidth + 230, halfHeight - 250);
            mCanvas.drawRect(mRect, mPaint);
            count += 1;
        } else if (count == 12) {
            mPaint.setColor(mColorEars);

            Point a = new Point(halfWidth - 230, halfHeight - 450);
            Point b = new Point(halfWidth - 230, halfHeight - 550);
            Point c = new Point(halfWidth - 220, halfHeight - 560);
            Point d = new Point(halfWidth - 100, halfHeight - 560);
            Point e = new Point(halfWidth - 90, halfHeight - 550);
            Point f = new Point(halfWidth - 90, halfHeight - 450);
            Path path = new Path();
            path.setFillType(Path.FillType.EVEN_ODD);
            path.lineTo(a.x, a.y);
            path.lineTo(b.x, b.y);
            path.lineTo(c.x, c.y);
            path.lineTo(d.x, d.y);
            path.lineTo(e.x, e.y);
            path.lineTo(f.x, f.y);
            path.lineTo(a.x, a.y);
            mCanvas.drawPath(path, mPaint);
            Point g = new Point(halfWidth + 90, halfHeight - 450);
            Point h = new Point(halfWidth + 90, halfHeight - 550);
            Point i = new Point(halfWidth + 100, halfHeight - 560);
            Point j = new Point(halfWidth + 220, halfHeight - 560);
            Point k = new Point(halfWidth + 230, halfHeight - 550);
            Point l = new Point(halfWidth + 230, halfHeight - 450);
            Path path2 = new Path();
            path2.setFillType(Path.FillType.EVEN_ODD);
            path2.lineTo(g.x, g.y);
            path2.lineTo(h.x, h.y);
            path2.lineTo(i.x, i.y);
            path2.lineTo(j.x, j.y);
            path2.lineTo(k.x, k.y);
            path2.lineTo(l.x, l.y);
            path2.lineTo(g.x, g.y);
            mCanvas.drawPath(path2, mPaint);
            count += 1;
        } else if (count == 13) {
            mPaint.setColor(mColorFoot2);

            mRect.set(halfWidth - 280, halfHeight + 350,
                    halfWidth - 80, halfHeight + 480);
            mCanvas.drawRect(mRect, mPaint);
            mRect.set(halfWidth + 280, halfHeight + 350,
                    halfWidth + 80, halfHeight + 480);
            mCanvas.drawRect(mRect, mPaint);
            count += 1;
        } else if (count == 14) {
            mPaint.setColor(mColorFoot1);

            mRect.set(halfWidth - 250, halfHeight + 350,
                    halfWidth - 50, halfHeight + 500);
            mCanvas.drawRect(mRect, mPaint);
            mRect.set(halfWidth + 50, halfHeight + 350,
                    halfWidth + 250, halfHeight + 500);
            mCanvas.drawRect(mRect, mPaint);
            count = 0;
        }
        view.invalidate();
    }
}