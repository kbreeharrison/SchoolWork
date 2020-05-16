
''' Purpose: demonstrate simple drawing commands '''

from PIL import Image, ImageDraw

def picture() :

    # replace dimensions and background as you see fit
    WIDTH  = 500
    HEIGHT = 500

    DIMENSIONS = [ WIDTH, HEIGHT]

    BACKGROUND_COLOR = '#330323'

    # create image of appropriate size
    im = Image.new( 'RGB', DIMENSIONS, BACKGROUND_COLOR )

    # get a drawable canvas of image im
    canvas = ImageDraw.Draw( im )

    canvas.polygon(
        [(50,100), (150,300),
         (250,100), (350, 300),
         (450,100), (450, 450),
         (50,450)],
        fill= 'goldenrod',
        outline='black')
    canvas.ellipse(
        [ (100,350), (160, 400)],
        fill= 'crimson',
        outline= 'crimson',
        width= 2 )
    canvas.ellipse(
        [(220, 350), (280, 400)],
        fill='crimson',
        outline='crimson',
        width=2)
    canvas.ellipse(
        [(340, 350), (400, 400)],
        fill='crimson',
        outline='crimson',
        width=2)
    # canvas.line(
    #     [(240, 200), (240, 280)],
    #     fill='black',
    #     width=3)
    # canvas.line(
    #     [(240,240), (270,200)],
    #     fill='black',
    #     width=3 )
    # canvas.line(
    #     [(240,240), (270,280)],
    #     fill='black',
    #     width=3)


    # return the art
    return im
