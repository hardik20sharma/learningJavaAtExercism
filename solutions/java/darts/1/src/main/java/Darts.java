class Darts {
    int score(double x, double y) {
        
        double dist = x*x + y*y;
        
        if(dist > 100)
            return 0;
        else if(dist > 25)
            return 1;
        else if(dist > 1)
            return 5;
        else
            return 10;
    }
}